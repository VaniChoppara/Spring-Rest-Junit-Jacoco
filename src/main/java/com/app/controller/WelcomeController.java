package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService welService;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = welService.getWelcomeMessage();
		return msg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		String msg = welService.getGreetMessage();
		return msg;
	}

}
