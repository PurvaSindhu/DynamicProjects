package com.xworkz.train.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.train.service.TrainServiceImple;
import com.xworkz.train.service.TrainServiceInter;


@WebServlet(loadOnStartup = 1, urlPatterns = "/login")
public class TrainController extends HttpServlet{
	
	
	TrainServiceInter trainService = new TrainServiceImple();
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Running initilize servelet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("enterName");
		System.out.println("name"+name);
		String number = req.getParameter("enterNumber");
		System.out.println("number"+number);
		String trainType = req.getParameter("trainType");
		System.out.println("trainType"+trainType);
		String destination = req.getParameter("destination");
		System.out.println("destination"+destination);
		String location = req.getParameter("location");
		System.out.println("location"+location);
		
		req.setAttribute("enterName" ,name);
		req.setAttribute(number, "enterNumber");
		req.setAttribute(trainType, "trainType");
		req.setAttribute(destination, "destination");
		req.setAttribute(location, "location");
		RequestDispatcher request = req.getRequestDispatcher("responce.jsp");
		request.forward(req, resp);
		
		
//		trainService.saveTrain(name, number, trainType, destination, location);
		try {
		String train = trainService.saveTrain(name, number, trainType, destination, location);
		PrintWriter writer = resp.getWriter();
		writer.write(train);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
