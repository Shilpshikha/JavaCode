package com.training.cntrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.daos.StudentDao;
import com.training.entity.Student;

@Controller
public class ShowController {
	
	@Autowired
	@Qualifier("dao")
	private StudentDao dao;

	@RequestMapping(value="/viewDept")
	public String deptList(Model model){
		
		List<String> department = new ArrayList<String>();
		department.add("ECE");
		department.add("CSE");
		department.add("EEE");
		department.add("MECH");
		department.add("CIVIL");
		department.add("SHOWALL");
		model.addAttribute("deptlist",department);
		return "DepartmentList";
	}
	
	@RequestMapping(value="/topperList/{deptName}",method=RequestMethod.GET)
	public String viewStudents(@PathVariable("deptName") String dept,Model model){
		
		List<Student> slist= new ArrayList<Student>();

		 if(dept.equals("SHOWALL")){
			slist = dao.findAll();
		}
		 else
			 slist = dao.getStudents(dept);
		
		model.addAttribute("student",slist);
		return "Display";
	}
	


}
