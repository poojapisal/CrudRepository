package com.erp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.main.model.Student;
import com.erp.main.service.HomeService;



@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	@GetMapping("/getAllData")
	public ResponseEntity<List<Student>>  getAllData()
	{   
		List<Student> lists=hs.getAllData();
		return new ResponseEntity<List<Student>>(lists, HttpStatus.OK);
	}
	
	@PostMapping("/savestudent")
	public ResponseEntity<Student> saveData(@RequestBody Student s)
	{
		Student s1=hs.saveData(s);
		return new ResponseEntity<Student>(s1,HttpStatus.CREATED);
	}
	
	@GetMapping("getsingleid/{id}")
	public ResponseEntity<Student>  getbyid(@PathVariable("rollno")int rollno)
	{
		Student s=hs.getbyid(rollno);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
		
	}
	@PutMapping("/update")
	public ResponseEntity<Student> updateData(@PathVariable Student s)
	{
		Student s1=hs.updateData(s);
		return new ResponseEntity<Student>(s1, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteData(@PathVariable("id") int rollno) 
	{
	
		hs.deleteData(rollno);
		return new ResponseEntity("Student is Deleted",HttpStatus.OK);
	}
}
