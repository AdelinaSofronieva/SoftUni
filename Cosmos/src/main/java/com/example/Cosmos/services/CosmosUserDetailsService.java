package com.example.Cosmos.services;


import com.example.Cosmos.models.entities.UserEntity;
import com.example.Cosmos.models.entities.UserRoleEntity;
import com.example.Cosmos.models.user.CosmosUserDetails;
import com.example.Cosmos.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CosmosUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CosmosUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        return userRepository.
                findByEmail(username).
                map(this::map).
                orElseThrow(() -> new UsernameNotFoundException("User with email " + username + " not found!"));
    }

    private UserDetails map(UserEntity userEntity) {
        return new CosmosUserDetails(
                userEntity.getPassword(),
                userEntity.getEmail(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getUserType().name(),
                userEntity.
                                getUserRoles().
                                stream().
                                map(this::map).
                                toList()
        );
    }

    private GrantedAuthority map(UserRoleEntity userRole) {
        return new SimpleGrantedAuthority("ROLE_" +
                userRole.
                        getUserRole().name());
    }
}
