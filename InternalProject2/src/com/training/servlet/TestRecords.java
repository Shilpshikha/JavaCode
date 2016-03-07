package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestRecords
 */
public class TestRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Map<String, List<String>> ordermap;
	List<String> rec;
	
    public TestRecords() {
        super();
        // TODO Auto-generated constructor stub
        ordermap= new HashMap<String, List<String>>();
        rec = new ArrayList<String>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		rec.add("203");
		rec.add("Neha");
		rec.add("24");
		rec.add("8763542");
		rec.add("ns@abc.com");
		rec.add("female");
		rec.add("lab");
		rec.add("2015-02-23");
		
		ordermap.put("103",rec);
		
		response.setContentType("text/plain");
		PrintWriter out=response.getWriter();
		String orderno =request.getParameter("orderno");
		
		List<String> lst = ordermap.get(orderno);
		String txt = lst.toString();
		out.println(txt);
		rec.clear();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
