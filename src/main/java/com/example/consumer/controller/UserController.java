package com.example.consumer.controller;

import com.example.consumer.entity.UserInformation;
import com.example.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;



    @PostMapping(value = "/add/user")
    public ResponseEntity<?> saveCustomer(@RequestBody UserInformation userInformation){
        userService.publishMessage(userInformation);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);

    }
}
