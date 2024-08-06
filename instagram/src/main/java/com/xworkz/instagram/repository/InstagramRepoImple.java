package com.xworkz.instagram.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InstagramRepoImple implements InstagramRepoInter{

	@Override
	public int instaDetails(String name, String password, int dob, String fName, String mName)
			throws Exception {
		String query = "insert into insta_details values (?,?,?,?,?)";
		System.out.println("this is connected");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkzodc@123");
		PreparedStatement pt = connect.prepareStatement(query);
		pt.setString(1,name);
		pt.setString(2,password);
		pt.setInt(3,dob);
		pt.setNString(4,fName);
		pt.setString(5, mName);
		
		int values = pt.executeUpdate();
		
		return values;
		
	}
	

}
