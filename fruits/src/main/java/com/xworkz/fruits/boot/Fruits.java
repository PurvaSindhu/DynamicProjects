package com.xworkz.fruits.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/fruit")
public class Fruits extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= req.getParameter("fruitName1");
		System.out.println(name);
		String name2= req.getParameter("fruitName1");
		System.out.println(name2);
		String name3= req.getParameter("fruitName1");
		System.out.println(name3);
		String name4= req.getParameter("orange");
		System.out.println(name4);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= req.getParameter("fruitName1");
		System.out.println(name);
		String name2= req.getParameter("fruitName1");
		System.out.println(name2);
		String name3= req.getParameter("fruitName1");
		System.out.println(name3);
		String name4= req.getParameter("orange");
		System.out.println(name4);
		
	}
	
	

}
