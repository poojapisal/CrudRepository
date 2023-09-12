package com.erp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.main.model.Student;
import com.erp.main.service.HomeService;



@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	@GetMapping("/getAllData")
	public List<Student> getAllData()
	{   
		List<Student> lists=hs.getAllData();
		return lists;
	}
	
	@PostMapping("/savestudent")
	public String saveData(@RequestBody Student s)
	{
		hs.saveData(s);
		return "Data Saved!";
	}
	
	@GetMapping("getsingleid/{id}")
	public Student getbyid(@PathVariable("rollno")int rollno)
	{
		Student s=hs.getbyid(rollno);
		return s;
		
	}
}
