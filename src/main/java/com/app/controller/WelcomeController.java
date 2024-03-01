package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.UserService;
import com.app.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService welService;
	
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);


	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.info("Started Welcome Msg()");
		String msg = welService.getWelcomeMessage();
		logger.info("Welcome Msg() execution done");
		return msg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("Started Greet Msg()");
		String msg = welService.getGreetMessage();
		logger.info("Greet Msg() execution done");
		return msg;
	}
	


}
