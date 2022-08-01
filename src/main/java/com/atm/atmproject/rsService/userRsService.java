package com.atm.atmproject.rsService;

import com.atm.atmproject.controller.impl.userServiceImpl;
import com.atm.atmproject.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userRsService {

    @Autowired
    userServiceImpl userService;

    @PostMapping("/create")
    public UserDto createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
        return userDto;
    }
}
