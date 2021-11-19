package com.infotech.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infotech.app.Student2;


@Controller
public class StudentControllerApp {
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public Student2 getStudent()
	{
		
		return new Student2("Dinesh", "kumar");
	}


}
