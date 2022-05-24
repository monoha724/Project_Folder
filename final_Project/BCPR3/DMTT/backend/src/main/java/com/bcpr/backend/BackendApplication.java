package com.bcpr.backend;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bcpr.backend.security.domain.Role;
import com.bcpr.backend.security.domain.User;
import com.bcpr.backend.security.service.UserService;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	// 테스트를 위한 가상 유저 생성
	// application.properties = create 시 run메소드 전체 주석 해제 필요
	// application.properties = update 시 run메소드 전체 주석 필요
	@Bean
    CommandLineRunner run(UserService userService){
        return args -> {
        	// 권한생성
//            userService.saveRole(new Role(null,"ROLE_USER"));
            // 유저생성
//            userService.saveUser(new User(null,"dahun3013@gmail.com","DMTT","",new ArrayList<>()));
            // 권한부여
//            userService.addRoleToUser("dahun3013@gmail.com","ROLE_USER");

        };
    }
}
