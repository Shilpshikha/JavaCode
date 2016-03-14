package com.trainin.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.trainin.entity.Book;

@Controller
@RequestMapping("/addBook.htm")
@SessionAttributes("command")
public class BookController {

	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Book book;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView initForm(){
		mdl.setViewName("AddBook");
		mdl.addObject("command", book);
		return mdl;
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("command") Book bk ){
		mdl.setViewName("success");
		return mdl;
	}
	
	@ModelAttribute("subjectCode")
	public String[] getSubjects(){
		return new String[]{"novels","computer science", "magazine"};
	}
}
