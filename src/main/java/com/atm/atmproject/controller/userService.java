package com.atm.atmproject.controller;

import com.atm.atmproject.dto.UserDto;
import com.atm.atmproject.entitys.UserEntity;
import org.springframework.http.ResponseEntity;

public interface userService {

    public UserDto updatePassword(UserDto userDto) throws Throwable;
    public UserDto createUser(UserDto userDto);
    public UserDto deleteUser(UserDto userDto) throws Throwable;


    //Model Mapper
    public UserDto entityToDto(UserEntity userEntity);
    public UserEntity dtoToEntity(UserDto userDto);
}

