package com.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("Pre process by authentication filter");
		chain.doFilter(request, response);
		System.out.println("Post process by authentication filter");
	
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res =(HttpServletResponse)response;
		String uname = req.getParameter("userName");
		String pass = req.getParameter("passWord");
		
		String role = (String)req.getAttribute("role");
	
		RequestDispatcher rd=null;
		if(uname.equals("vijay")&&pass.equals("vj")){
			
			if(role.equals("ADM")){
				rd= req.getRequestDispatcher("admin.jsp");
			}
			else if(role.equals("CHF")){
				rd=req.getRequestDispatcher("chef.jsp");
			}
			else if(role.equals("WAI")){
				rd=req.getRequestDispatcher("waiter.jsp");
			}
			else if(role.equals("MGR")){
				rd=req.getRequestDispatcher("manager.jsp");
			}
		}
		else  rd= req.getRequestDispatcher("emp.jsp");
		rd.forward(req, res);

	
	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
