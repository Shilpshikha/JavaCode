package com.training.listeners;

import java.sql.Connection;
import java.sql.DriverManager;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener  implements ServletContextListener,ServletContextAttributeListener {

    /**
     * Default constructor. 
     * 
     * 
     */

	Connection con=null;
	
	public MyContextListener() {
        // TODO Auto-generated constructor stub
    }
       
  

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	
    	String userName = event.getServletContext().getInitParameter("username");
    	String password =event.getServletContext().getInitParameter("password");
    	String classname =event.getServletContext().getInitParameter("classname");
    	String url =event.getServletContext().getInitParameter("url");
    	System.out.println("Context initialized " );
    	System.out.println("Username : " + userName );
    	System.out.println("Password :  " + password );
    	System.out.println("ClassName :  " + classname );
    	System.out.println("url : " + url);
    	
    	
    	try{
    		Class.forName(classname);
    		con=DriverManager.getConnection(url, userName, password);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	System.out.println("Connection established " + con);
    	
    	event.getServletContext().setAttribute("dbconn", con);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("Context destroyed");
    }



	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Attribute added " + event.getServletContext().getAttributeNames());
	}



	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Attribute removed " + event.getServletContext().getAttributeNames());

	}



	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
