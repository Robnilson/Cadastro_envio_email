package com.ms.user.controllers;


import com.ms.user.dtos.UserRecordDto;
import com.ms.user.models.UserModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller

public class UserController {

        @PostMapping("/users")
        public ResponseEntity<UserModel>saveUser(@RequestBody @Valid UserRecordDto userRecordDto ) {

            var userModel = new UserModel();
            BeanUtils.copyProperties(userRecordDto, userModel);
            return ResponseEntity.status(HttpStatus.CREATED).body();
        }



}