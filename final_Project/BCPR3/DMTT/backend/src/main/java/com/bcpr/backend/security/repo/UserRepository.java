package com.bcpr.backend.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcpr.backend.security.domain.User;

// CRUD 함수를 JpaRepository 가 들고있음
// @Repository 를 가지고 있음
public interface UserRepository extends JpaRepository<User,Integer>{
	// findBy 규칙 -> Username 문법
	// select * from user where username = ?
	public User findByEmail(String email);
}
