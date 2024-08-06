package com.xworkz.matrimony.boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/marriage")
public class Matrimony extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    String name= req.getParameter("name");
		System.out.println(name);
		String email= req.getParameter("email");
		System.out.println(email);
		String male = req.getParameter("male");
		System.out.println(male);
		String female = req.getParameter("female");
		System.out.println(female);
		String age = req.getParameter("age");
		System.out.println(age);
		 
		
		  PrintWriter writer = resp.getWriter(); //
    	  writer.print("the request is prossing... please wait"); //
		  resp.setContentType("text/html "
		  		+ ""
		  		+ ""
		  		+ ""
		  		+ ""); 
		  	
		
		
		req.setAttribute("Rname" ,name);
		req.setAttribute("Rage", age);		
	    req.setAttribute("REmail", email);
		req.setAttribute("Rmale" ,male);
	    req.setAttribute("Rfemale",female);

	    RequestDispatcher request = req.getRequestDispatcher("response.jsp");
	    request.forward(req, resp);
		
	}

}
