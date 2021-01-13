package com.pralan.security.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/myAuthcontroller")
public class AuthController {

	
	@RequestMapping( value = "/login", method = RequestMethod.POST)
	String login() {
		return null;
	}
	
	@RequestMapping( value = "/register", method = RequestMethod.POST)
	String register() {
		return null;
	}
	
}
