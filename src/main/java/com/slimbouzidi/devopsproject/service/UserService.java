package com.slimbouzidi.devopsproject.service;

import com.slimbouzidi.devopsproject.entity.User;
import com.slimbouzidi.devopsproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repo;

    public List<User> getAllUsers() { return repo.findAll(); }

    public User saveUser(User u) { return repo.save(u); }
}
