package com.example.Cosmos.models.mapper;
import com.example.Cosmos.models.dtos.UserRegisterDTO;
import com.example.Cosmos.models.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "active", constant = "true")
    UserEntity userDtoToUserEntity(UserRegisterDTO userRegisterDTO);

}
