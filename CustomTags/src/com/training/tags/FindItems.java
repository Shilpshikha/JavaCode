package com.training.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



public class FindItems extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String items;

	public FindItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public int doStartTag() throws JspException {
	
		JspWriter out = pageContext.getOut();
		List<Object> namelist =  (List<Object>)pageContext.findAttribute(items);
		if(items!=null)
			for(Object name : namelist){
				try {
					out.println(name);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return SKIP_BODY;
	}


}
