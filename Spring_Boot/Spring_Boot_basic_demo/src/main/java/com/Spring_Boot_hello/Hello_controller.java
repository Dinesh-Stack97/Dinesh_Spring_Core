package com.Spring_Boot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController //this controller is used to make any class a rest -we can have methods in class thast mapped to url request

public class Hello_controller {
	
	@RequestMapping("/hello/")// this maps the url specified with the method
	public String sayHi()
	{
		return "Hi";
		
	}

}
