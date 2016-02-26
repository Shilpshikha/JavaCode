package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Logger log = Logger.getLogger(this.getClass());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        log.info("Constructor called");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		log.info("Vendor -Request Object: " + request.getClass().toString() );
		log.info("Vendor -Response Object: " + response.getClass().toString() );
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String user=request.getParameter("userName");
		String pass=request.getParameter("passWord");
		String role=request.getParameter("role");
		
		User usr = new User(user,pass,role);
		ValidateUser vu = new ValidateUser();
		System.out.println(vu.validate(usr));
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align='text-align:center'>Welcom to servlet programming<h2>");
		out.println("Welcome : " + role + " : " + user);
		out.println("");
		
		if(vu.validate(usr)==true){
			out.println("User exists");	
		}
		else out.println("Wrong user");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
