package com.myguru.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myguru.springsecurityjwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String username);
}
