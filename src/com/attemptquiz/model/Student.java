package com.attemptquiz.model;

import java.util.Date;
import java.util.List;

public class Student {
private String name;
private String email;
private String phonenumber;
private List<String> subjects;
private String testsubject;
private Date date;

public String getTestsubject() {
	return testsubject;
}
public void setTestsubject(String testsubject) {
	this.testsubject = testsubject;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public List<String> getSubjects() {
	return subjects;
}
public void setSubjects(List<String> subjects) {
	this.subjects = subjects;
}
}
