package com.erp.main.homeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.main.model.Student;
import com.erp.main.repository.HomeRepository;
import com.erp.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}
	
	

}