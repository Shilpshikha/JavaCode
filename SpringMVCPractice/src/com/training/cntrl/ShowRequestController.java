package com.training.cntrl;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class ShowRequestController {

	@RequestMapping("/showAll")
	public String getAllRequests(Model model){
		
		List<CarRental> data = new ArrayList<CarRental>();
		data.add(new CarRental("Ramesh",94732322L,"ram@abc.com","sedan-ac"));
		data.add(new CarRental("Suresh",34249123L,"sur@abc.com","sedan non-ac"));
		data.add(new CarRental("Ganesh",23243545L,"gan@abc.com",""));
	
		model.addAttribute("reqList", data);
		return "ShowAllRequest";
	}
	
	@RequestMapping(value="/findRequest/{custName}/{custMail}",method=RequestMethod.GET)
	public String viewCustomer(@PathVariable("custName") String custName, @PathVariable("custMail") String custMail, Model model) throws Exception{
		
		String msg= "10 bookings of " + custName + ", email: " + custMail;
		if(custName.equals("Ramesh")){
			msg="20 Bookings of "+custName + ", email: " + custMail;
		}
		if(custName.equals("Suresh")){
			throw new Exception();
		}
		model.addAttribute("data", msg);
		return "Display";
	}
	
	ModelAndView model = new ModelAndView();
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(HttpServletRequest req,Exception ex){
		model.setViewName("RunTimeHandler");
		model.addObject("msg","Run time Exception Handler called");
		model.addObject("url",req.getRequestURL());
		model.addObject("exception",ex);
		return model;
	}
}
