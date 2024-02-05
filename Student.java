package com.exa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String email;
private String branch;
public Student() {
	super();
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public Student(int id, String email, String branch, String name) {
	super();
	this.id = id;
	this.email = email;
	this.branch = branch;
	this.name = name;
}


public int getId()
{
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;

}
