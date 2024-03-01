package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	
	@GetMapping("/getuser")
	public String getUser() {
		
		return userService.getUser();
		
	}
}
