package com.attemptquiz.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.attemptquiz.model.Teacher;




public class TeacherDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Teacher p){    
	    String sql="insert into Teacher(name,email,phonenumber) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getPhonenumber()+"')";    
	    return template.update(sql);    
	} 
	
}
