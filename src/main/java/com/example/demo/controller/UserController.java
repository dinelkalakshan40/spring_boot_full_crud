package com.example.demo.controller;


import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {
    @Autowired
    private  UserService userService;


    @GetMapping("/getusers")
    public List<UserDto> getUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/adduser")
    public ResponseEntity<String> saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
        return ResponseEntity.ok("User saved successfully");
    }

}
