package com.training.cntrl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
@SessionAttributes("command")
public class CarRentalController {
	
	@RequestMapping("/")
	public String initApp(){
		return "index";
	}
	
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private CarRental car; 

	@RequestMapping(name="/AddRequest",method=RequestMethod.GET)
	public ModelAndView initForm(){
		mdl.setViewName("RentForm");
		mdl.addObject("command",car);
		return mdl;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView onSubmit(@Valid @ModelAttribute("command") CarRental carRent,BindingResult result){
		
	
		if(result.hasErrors()){
			mdl.setViewName("RentForm");
		}
		else {
			mdl.setViewName("ShowForm");
		}
		return mdl;
	}
	
	@ModelAttribute("carType")
	public String[] getCarType(){
		return new String[]{"sedan-ac","sedan non-ac","SUV","Luxury Car"};
	}
	
	@RequestMapping("check")
	public String checklist(@RequestParam("name") String name, Model mdl){
		mdl.addAttribute("prevBooking", "Your booking was on 12th March");
		return "ShowForm";
	}
	
}
