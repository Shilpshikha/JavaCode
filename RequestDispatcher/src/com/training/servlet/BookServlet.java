package com.training.servlet;


import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.BookManager;
import com.training.entity.Book;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		BookManager mgr= new BookManager();
		HashMap<Long,Book> bookList = mgr.getAllBooks();
		request.setAttribute("foundBooks", bookList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBook.jsp");
		dispatcher.forward(request, response);
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		BookManager mgr= new BookManager();
		Long id= Long.parseLong(request.getParameter("bookid"));
		Book bk = mgr.finBookById(id);
		request.setAttribute("foundBook", bk);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Show.jsp");
		dispatcher.forward(request, response);
	}

}
