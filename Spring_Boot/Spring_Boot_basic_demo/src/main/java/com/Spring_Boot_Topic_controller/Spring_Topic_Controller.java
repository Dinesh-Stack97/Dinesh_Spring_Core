package com.Spring_Boot_Topic_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Spring_Topic_Controller {
	
	@RequestMapping()
	public String getAllTopics() {
		return "All Topics";
	}

}
