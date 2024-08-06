package com.xworkz.chair.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/sofa")
public class Chair extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("userName");
		System.out.println(name);
		String email = req.getParameter("userEmail");
		System.out.println(email);
		String amount = req.getParameter("userPrice");
		System.out.println(amount);
		String sofas = req.getParameter("sofa");
		System.out.println(sofas);
		String chairs = req.getParameter("chair");
		System.out.println(chairs);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("userName");
		System.out.println(name);
		String email = req.getParameter("userEmail");
		System.out.println(email);
		String amount = req.getParameter("userPrice");
		System.out.println(amount);
		String sofas = req.getParameter("sofa");
		System.out.println(sofas);
		String chairs = req.getParameter("chair");
		System.out.println(chairs);
	}
	
	

}
