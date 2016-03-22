package com.training.cntrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.StudentDao;
import com.training.entity.Student;

@Controller
public class AddController {

	@RequestMapping("/")
	public String initApp(){
		return "index";
	}
	
	@Autowired
	@Qualifier("dao")
	private StudentDao dao;
	
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student student;
	
	@RequestMapping(value="/AddDetails",method=RequestMethod.GET)
	public ModelAndView initForm(){
		mdl.setViewName("StudentForm");
		mdl.addObject("command", student);
		return mdl;
	}
	
	@ModelAttribute("dept")
	public String[] departmentNames(){
		return new String[]{"ECE","CSE","EEE","MECH","CIVIL"};
	}
	
	@RequestMapping(value="/PostDetails", method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("studobj") Student stud, Model mdl){
		
		double grade = stud.calculate();
		stud.setGrade(grade);
		
		System.out.println(grade);
		dao.add(stud);
		List<Student> slist = new ArrayList<Student>();
		slist = dao.findAll();
		mdl.addAttribute("student", slist);
		return "Display";
		
	}
}
