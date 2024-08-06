package com.xworkz.instagram.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.instagram.services.InstagramServiceImple;
import com.xworkz.instagram.services.InstagramServiceInter;


@WebServlet(loadOnStartup = 1,urlPatterns = "/login")
public class Instagram extends HttpServlet{
	
	InstagramServiceInter instaservice = new InstagramServiceImple();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	@Override
	public void init() throws ServletException {
		System.out.println("this is init method");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    String name = req.getParameter("name");
	    System.out.println("name is="+name);
	    String password = req.getParameter("password");
	    System.out.println("name is="+password);
	    String dob = req.getParameter("dob");
	    System.out.println("name is="+dob);
	    String fname = req.getParameter("fname");
	    System.out.println("name is="+fname);
	    String mname = req.getParameter("mname");
	    System.out.println("name is="+mname);
	    String gender = req.getParameter("gender");
	    System.out.println("name is="+gender);
	    
	    req.setAttribute("Rname" , name);
	    req.setAttribute("Rpassword", password);
	    req.setAttribute("Rdob", dob);
	    req.setAttribute("Rfname", fname);
	    req.setAttribute("Rmname", mname);
	    req.setAttribute("Rgender", gender);
	    req.setAttribute("Rgender", gender);
	    RequestDispatcher request = req.getRequestDispatcher("response.jsp");
	    request.forward(req, resp);
	    
	    try {
	    String service=instaservice.instaDetails(name, password, 0, fname, mname);
	    PrintWriter writer = resp.getWriter();
	    writer.write(service);
	    }catch (Exception e){
	    	e.printStackTrace();
	    }
	    
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
