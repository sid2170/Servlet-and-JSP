package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee1;
import com.demo.service.Employee1Service;
import com.demo.service.Employee1ServiceImpl;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id= Integer.parseInt(request.getParameter("id"));
		String name =request.getParameter("e1name");
		float salary =Float.parseFloat(request.getParameter("e1salary"));
		String dept=request.getParameter("e1dept");
		
		
		Employee1 e= new Employee1();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDept(dept);
		
		Employee1Service eService = new Employee1ServiceImpl();
		  eService.save(e);
		  
		  RequestDispatcher rd= request.getRequestDispatcher("GetServlet");
		  rd.forward(request, response);
		  
		  PrintWriter out =response.getWriter();
			out.print(id+" "+name+" "+salary+" "+dept);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
