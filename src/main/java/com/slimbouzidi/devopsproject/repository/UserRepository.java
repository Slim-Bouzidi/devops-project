package com.slimbouzidi.devopsproject.repository;

import com.slimbouzidi.devopsproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}