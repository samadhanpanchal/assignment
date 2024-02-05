package com.exa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exa.dao.StudentRepository;
import com.exa.model.Student;
@Service
public class ServiceStudentImpl implements ServiceStudent{
	@Autowired
StudentRepository StudentRepo;
	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepo.save(student);
	}
	@Override
	public List<Student> getAllPlayers() {
		// TODO Auto-generated method stub
		return StudentRepo.findAll();
	}
	@Override
	public Student updateStudent(Student student) {
		Student existingStudent = StudentRepo.findById(student.getId()).orElse(null);
       existingStudent.setName(student.getName());
		return StudentRepo.save(existingStudent);
	}
	@Override
	public Student deletestudent(int id) {
		// TODO Auto-generated method stub
		StudentRepo.deleteById(id);
		return null;
	}

}
