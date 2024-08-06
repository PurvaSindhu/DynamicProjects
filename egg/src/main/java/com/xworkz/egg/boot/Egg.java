package com.xworkz.egg.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/hen")
public class Egg extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("henEgg");
		System.out.println(name);
		String egg1 = req.getParameter("numb");
		System.out.println(egg1);
		String  egg2= req.getParameter("price");
		System.out.println(egg2);
		String type = req.getParameter("white");
		System.out.println(type);
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("henEgg");
		System.out.println(name);
		String egg1 = req.getParameter("numb");
		System.out.println(egg1);
		String  egg2= req.getParameter("price");
		System.out.println(egg2);
		String type = req.getParameter("white");
		System.out.println(type)
	}

}
