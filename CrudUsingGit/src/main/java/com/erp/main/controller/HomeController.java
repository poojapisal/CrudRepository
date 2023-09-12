package com.erp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.main.model.Student;
import com.erp.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	@GetMapping("/get")
	public String getData()
	{
		return "Demo Git Project";
	}
	
	@PostMapping("/savestudent")
	public String saveData(@RequestBody Student s)
	{
		hs.saveData(s);
		return "Data Saved!";
	}
}
