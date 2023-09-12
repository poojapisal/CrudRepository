package com.erp.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.main.model.Student;

@RestController
public class HomeController {

	
	@GetMapping("/get")
	public String getData()
	{
		return "Demo Git Project";
	}
	
	@PostMapping("/savestudent")
	public String saveData(@RequestBody Student s)
	{
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(s.getAddress());
		return "save Student";
		
	}
}
