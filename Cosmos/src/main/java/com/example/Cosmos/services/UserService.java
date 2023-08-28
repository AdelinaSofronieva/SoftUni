package com.example.Cosmos.services;

import com.example.Cosmos.models.dtos.UserRegisterDTO;
import com.example.Cosmos.models.entities.UserEntity;
import com.example.Cosmos.models.mapper.UserMapper;
import com.example.Cosmos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;
    private final UserDetailsService userDetailsService;

    @Autowired
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       UserMapper userMapper, UserDetailsService userDetailsService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
        this.userDetailsService = userDetailsService;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO) {
        //create user without using mapstruct
//        UserEntity newUser = new UserEntity();
//        newUser.setActive(true);
//        newUser.setEmail(userRegisterDTO.getEmail());
//        newUser.setFirstName(userRegisterDTO.getFirstName());
//        newUser.setLastName(userRegisterDTO.getLastName());

        UserEntity newUser = userMapper.userDtoToUserEntity(userRegisterDTO);
        newUser.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        newUser.addUserType();

        newUser = userRepository.save(newUser);

        login(newUser);

    }

    private void login(UserEntity userEntity) {
        UserDetails userDetails =
                userDetailsService.loadUserByUsername(userEntity.getEmail());

        Authentication auth = new UsernamePasswordAuthenticationToken(
                userDetails,
                userDetails.getPassword(),
                userDetails.getAuthorities()
        );

        SecurityContextHolder.
                getContext().
                setAuthentication(auth);
    }
}
