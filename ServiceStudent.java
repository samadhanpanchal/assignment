package com.exa.service;

import java.util.List;

import com.exa.model.Student;

public interface ServiceStudent {

	Student addstudent(Student student);

	List<Student> getAllPlayers();

	Student updateStudent(Student student);

	Student deletestudent(int id);

}
