package com.infotech.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody//It converts jason to java and java to Jason Objects
@RestController//Combination of @Controller and @Response Body
public class Hello_Controller {//able to handle web request
	//get http method
	@GetMapping("/hellowworld")
	public String hellowWorld()
	{
		return "Hello World";
	}
	//get
	//post
	//delete

}
