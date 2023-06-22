package com.example.SpaceTravelAgency.services;

import com.example.SpaceTravelAgency.models.dtos.UserLoginDTO;
import com.example.SpaceTravelAgency.models.dtos.UserRegisterDTO;
import com.example.SpaceTravelAgency.models.entities.UserEntity;
import com.example.SpaceTravelAgency.models.mapper.UserMapper;
import com.example.SpaceTravelAgency.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       UserMapper userMapper) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }


    private void login(UserEntity userEntity) {
        //TODO
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
}
