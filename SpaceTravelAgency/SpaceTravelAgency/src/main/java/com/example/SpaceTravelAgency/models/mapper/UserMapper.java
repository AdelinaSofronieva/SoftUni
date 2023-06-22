package com.example.SpaceTravelAgency.models.mapper;
import com.example.SpaceTravelAgency.models.dtos.UserRegisterDTO;
import com.example.SpaceTravelAgency.models.entities.UserEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "active", constant = "true")
    UserEntity userDtoToUserEntity(UserRegisterDTO userRegisterDTO);

}
