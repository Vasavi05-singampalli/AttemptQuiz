package com.attemptquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.attemptquiz.dao.TeacherDao;
import com.attemptquiz.model.Teacher;




@Controller
public class TeacherController {
@Autowired
	TeacherDao teacherdao;
  
@RequestMapping(value="/uploadfile",method = RequestMethod.POST)    
private ModelAndView uploadfile(@ModelAttribute("teacher") Teacher teacher,ModelMap model){    
    teacherdao.save(teacher);    
    String personname=teacher.getName();
    System.out.println(personname);
    String personemail=teacher.getEmail();
    System.out.println(personemail);
    String personphoneno=teacher.getPhonenumber();
    System.out.println(personphoneno);    
    String message="Welcome to the page to upload exam papers "+personname;
    return new ModelAndView("viewteacher", "welcomeMessage", message); 
}

}
