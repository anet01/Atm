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

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class userServiceImpl implements userService {

    @Autowired
    private userDao userDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto updatePassword(UserDto userDto) throws Exception {
        UserEntity userEntity = dtoToEntity(userDto);
        UserEntity user = (UserEntity) userDao.findById(userEntity.getId())
                .orElseThrow(()-> new Exception("Kullanıcı bulunamadı. Id: " + userEntity.getId()));

        if(user.getPassword().equals(userEntity.getPassword())){
            user.setPassword(userDto.getNewPassword());
            userDao.save(user);
            userDto = entityToDto(user);

        }
        else {
            throw new IllegalAccessException("Şifre doğru değil");
        }


        return userDto;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = dtoToEntity(userDto);
        userDao.save(userEntity);

        return userDto;
    }

    @Override
    public UserDto deleteUser(UserDto userDto) throws Exception {
        UserEntity userEntity = dtoToEntity(userDto);
        UserEntity user = (UserEntity) userDao.findById(userEntity.getId())
                .orElseThrow(()-> new Exception("Kullanıcı bulunamadı. Id: " + userEntity.getId()));

        if (user.getPassword().equals(userEntity.getPassword())) {
            user.setDeleted(true);
            userDao.save(user);
            userDto = entityToDto(user);
        } else {
            throw new IllegalAccessException("Şifre doğru değil");
        }


        return userDto;


    }

    @Override
    public UserDto entityToDto(UserEntity userEntity) {
        UserDto userDto = modelMapper.map(userEntity, UserDto.class);
        return userDto;
    }

    @Override
    public UserEntity dtoToEntity(UserDto userDto) {
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        return userEntity;
    }
}
