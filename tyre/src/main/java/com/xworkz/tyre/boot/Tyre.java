package com.xworkz.tyre.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/zlx")
public class Tyre extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String name = req.getParameter("userName");
		System.out.println("the do get method is=="+name);
		String password = req.getParameter("userPassword");
		System.out.println("the do get method is=="+password);
		String Email = req.getParameter("userEmail");
		System.out.println("the do get method is=="+Email);
		String radio = req.getParameter("male");
		System.out.println("the do get method is=="+radio);
		String radio1 = req.getParameter("female");
		System.out.println("the do get method is=="+radio1);
		String radio2 = req.getParameter("others");
		System.out.println("the do get method is=="+radio2);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	

}
