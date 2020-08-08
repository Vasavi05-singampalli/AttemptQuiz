package com.attemptquiz.dao;


import java.util.Date;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.attemptquiz.model.Student;



public class StudentDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Student p){  
//	here we have to call getstudentdetails method,and pass phno,give result,if it is not empty we run update query r else we have to insert query
		Student studDet=getStudentDetails(p.getPhonenumber());//calling from Student class
		Date date = new Date(); 	
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		p.setDate(sqldate);			    
		if(studDet==null){		
	    String insertsql="insert into Student(name,email,phonenumber,testsubject,date) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getPhonenumber()+"','"+p.getTestsubject()+"','"+p.getDate()+"')";    
	    return template.update(insertsql);
		}
		else{
			String updatesql="update Student set name='"+p.getName()+"', email='"+p.getEmail()+"',testsubject='"+p.getTestsubject()+"',date='"+p.getDate()+"' where phonenumber='"+p.getPhonenumber()+"'";    
		    return template.update(updatesql);
		}
	}
	public Student getStudentDetails(String phonenumber){    
	 String selectsql="select * from Student where phonenumber=?";  
	 System.out.println(phonenumber);
	 try{
	    return template.queryForObject(selectsql, new Object[]{phonenumber},new BeanPropertyRowMapper<Student>(Student.class));    
	} catch(EmptyResultDataAccessException eRDAE){
		return null;
	} 
	}
}
