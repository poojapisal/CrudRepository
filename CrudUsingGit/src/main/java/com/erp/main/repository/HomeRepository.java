package com.erp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.main.model.Student;
import java.util.List;

@Repository
public interface HomeRepository extends JpaRepository<Student, Integer>{
	Student  findByRollno(int rollno);

}
