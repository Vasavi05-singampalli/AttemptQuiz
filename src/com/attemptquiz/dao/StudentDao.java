package com.attemptquiz.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import com.attemptquiz.model.Student;


public class StudentDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Student p){    
	    String sql="insert into Student(name,email,phonenumber,subject,date) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getPhonenumber()+"','"+p.getTestsubject()+"','"+p.getDate()+"')";    
	    return template.update(sql);    
	}
	
}
