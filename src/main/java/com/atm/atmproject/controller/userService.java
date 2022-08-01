package com.atm.atmproject.controller;

import com.atm.atmproject.dto.UserDto;
import com.atm.atmproject.entitys.UserEntity;
import org.springframework.http.ResponseEntity;

public interface userService {

    public ResponseEntity<UserDto> updatePassword(Long id, UserDto userDto) throws Throwable;
    public UserDto createUser(UserDto userDto);
    public UserDto deleteUser(UserDto userDto);


    //Model Mapper
    public UserDto entityToDto(UserEntity userEntity);
    public UserEntity dtoToEntity(UserDto userDto);
}

