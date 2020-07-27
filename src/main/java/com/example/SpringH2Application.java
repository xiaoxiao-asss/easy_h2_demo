package com.example;

import com.example.demo.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringH2Application {
	@Resource
	private UserDao userMapper;
	public static void main(String[] args) {
		SpringApplication.run(SpringH2Application.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println(userMapper.findById(1));
	}*/

}
