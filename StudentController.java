package com.exa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exa.model.Student;
import com.exa.service.ServiceStudent;


@RestController
public class StudentController 
{
	@Autowired
	ServiceStudent servicestudent;
	
	@PostMapping("/save")
	public Student addstu(@RequestBody Student student)
	{
		return servicestudent.addstudent(student);
	}
	@GetMapping("/getAll")
	public List<Student> getAllPlayers() {
			
			return servicestudent.getAllPlayers();
		}
	@PutMapping("/update")
	public Student updateplayer(@RequestBody Student student) {
        return servicestudent.updateStudent(student);
    }

	@DeleteMapping("/delete/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return  servicestudent.deletestudent(id);
	}
}
