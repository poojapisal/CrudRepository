package com.erp.main.service;

import java.util.List;

import com.erp.main.model.Student;

public interface HomeService {

	void saveData(Student s);

	List<Student> getAllData();

	Student getbyid(int rollno);

	void updateData(Student s);

}
