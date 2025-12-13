package com.slimbouzidi.devopsproject.controller;

import com.slimbouzidi.devopsproject.entity.User;
import com.slimbouzidi.devopsproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public List<User> getUsers() { return service.getAllUsers(); }

    @PostMapping
    public User createUser(@RequestBody User user) { return service.saveUser(user); }
}