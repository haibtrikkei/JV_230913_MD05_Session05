package com.ra.controller;

import com.ra.model.dto.request.UserLoginDTO;
import com.ra.model.dto.request.UserRequestDTO;
import com.ra.model.dto.response.UserLoginResponseDTO;
import com.ra.model.dto.response.UserResponseDTO;
import com.ra.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRequestDTO requestDTO){
        UserResponseDTO userResponseDTO= userService.register(requestDTO);
        return new ResponseEntity<>(userResponseDTO,HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody UserLoginDTO userLoginDTO){
        UserLoginResponseDTO userLoginResponseDTO = userService.login(userLoginDTO);
        return new ResponseEntity<>(userLoginResponseDTO,HttpStatus.OK);
    }
}
