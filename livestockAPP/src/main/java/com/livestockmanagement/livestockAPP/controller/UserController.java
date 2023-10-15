package com.livestockmanagement.livestockAPP.controller;

import com.livestockmanagement.livestockAPP.entity.User;
import com.livestockmanagement.livestockAPP.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }


}
