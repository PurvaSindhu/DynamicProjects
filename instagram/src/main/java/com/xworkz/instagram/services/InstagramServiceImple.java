package com.xworkz.instagram.services;

import com.xworkz.instagram.repository.InstagramRepoImple;
import com.xworkz.instagram.repository.InstagramRepoInter;

public class InstagramServiceImple implements InstagramServiceInter{
	
	InstagramRepoInter instaRepo = new InstagramRepoImple();

	@Override
	public String instaDetails(String name, String password, int dob, String fName, String mName) throws Exception{
	
		int insta =	instaRepo.instaDetails(name, password, dob, fName, mName);
		
		if(insta ==1) {
			return "successfully saved";
		}
		return "data not saved";
	}

}
