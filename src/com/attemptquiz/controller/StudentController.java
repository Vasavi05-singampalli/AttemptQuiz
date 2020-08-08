package com.attemptquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.attemptquiz.dao.StudentDao;
import com.attemptquiz.model.Student;

@Controller
public class StudentController {
@Autowired
StudentDao studentdao;

@RequestMapping(value="/taketest",method = RequestMethod.POST)    
private ModelAndView taketest(@ModelAttribute("student") Student student,ModelMap model){    
	
	
    studentdao.save(student);

    String personname=student.getName();
    String message="Welcome to exam portal "+personname;
    return new ModelAndView("viewstudent", "welcomeMessage", message);  
//    to write code to read the file and display on student exam portal instead of the message?!!!!!!
}

}
