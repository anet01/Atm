package com.atm.atmproject.rsService;

import com.atm.atmproject.controller.impl.userServiceImpl;
import com.atm.atmproject.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

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

    @PostMapping("/update_password")
    public ResponseEntity<UserDto> createPassword(@RequestBody UserDto userDto) throws Throwable {
        return ResponseEntity.ok(userService.updatePassword(userDto));
    }

    @PostMapping("/delete")
    public ResponseEntity<UserDto> userDelete(@RequestBody UserDto userDto) throws Throwable {


        return ResponseEntity.ok(userService.deleteUser(userDto));
    }
}
