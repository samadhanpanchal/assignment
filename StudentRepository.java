package com.exa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exa.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
