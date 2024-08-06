package com.xworkz.train.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TrainRepoImplements implements TrainRepoInter {

	@Override
	public int saveTrain(String name, String number, String trainType, String destination, String location) throws Exception{
		String query = "insert into details values (?,?,?,?,?)";
		System.out.println("the connection is created");
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/train_data","root","Xworkzodc@123");
		 
		PreparedStatement pt = connect.prepareStatement(query);
		pt.setString(1,name);
		pt.setString(2, number);
		pt.setString(3, trainType);
		pt.setString(4, destination);
		pt.setString(5, location);
		
		int results = pt.executeUpdate();
		
		return results;
		
	
	}

}
