package com.atm.atmproject.controller.impl;

import com.atm.atmproject.controller.userService;
import com.atm.atmproject.dto.UserDto;
import com.atm.atmproject.entitys.UserEntity;
import com.atm.atmproject.repository.userDao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class userServiceImpl implements userService {

    @Autowired
    private userDao userDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<UserDto> updatePassword(Long id, UserDto userDto) throws Throwable {
        return null;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = dtoToEntity(userDto);
        userDao.save(userEntity);

        return userDto;
    }

    @Override
    public UserDto deleteUser(UserDto employeeDto) {
        return null;
    }

    @Override
    public UserDto entityToDto(UserEntity employeeEntity) {
        return null;
    }

    @Override
    public UserEntity dtoToEntity(UserDto userDto) {
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        return userEntity;
    }
}
