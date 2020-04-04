package com.tyss.springsecurityrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.springsecurityrest.bean.UserResponce;

@RestController
public class SpringSecurityController {
	@GetMapping("/home")
	public UserResponce home() {
		UserResponce responce = new UserResponce();
		responce.setStatusCode(201);
		responce.setMessage("Success");
		responce.setDescription("Go to home page");
		return responce;
	}

	@GetMapping("/admin")
	public UserResponce admin() {
		UserResponce responce = new UserResponce();
		responce.setStatusCode(201);
		responce.setMessage("Success");
		responce.setDescription("Go to admin page");
		return responce;
	}
	
}
