package com.erp.main.service;

import java.util.List;

import com.erp.main.model.Student;

public interface HomeService {

	Student saveData(Student s);

	List<Student> getAllData();

	Student getbyid(int rollno);

	Student updateData(Student s);

	void deleteData(int rollno);

}
