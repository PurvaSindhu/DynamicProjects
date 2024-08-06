package com.xworkz.juice.boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/avacado")
public class Juice extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("userName");
		System.out.println("the used name is="+name);
		String email = req.getParameter("userEmail");
		System.out.println("the used name is="+email);
		String orders = req.getParameter("order");
		System.out.println("the used name is="+orders);
		String flavors = req.getParameter("mango");
		System.out.println("the used name is="+flavors);
		String flavors1 = req.getParameter("apple");
		System.out.println("the used name is="+flavors1);
		String flavors2 = req.getParameter("orange");
		System.out.println("the used name is="+flavors2);
		String amount = req.getParameter("price");
		System.out.println("the used name is="+amount);
		
		
		PrintWriter writer= resp.getWriter();
		writer.write("the order is successful");
		
		resp.setContentType("text/plain");
		resp.setContentType("text/html");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("userName");
		System.out.println("the used name is="+name);
		String email = req.getParameter("userEmail");
		System.out.println("the used name is="+email);
		String orders = req.getParameter("order");
		System.out.println("the used name is="+orders);
		String flavors = req.getParameter("mango");
		System.out.println("the used name is="+flavors);
		String flavors1 = req.getParameter("apple");
		System.out.println("the used name is="+flavors1);
		String flavors2 = req.getParameter("orange");
		System.out.println("the used name is="+flavors2);
		String amount = req.getParameter("price");
		System.out.println("the used name is="+amount);
	}

}
