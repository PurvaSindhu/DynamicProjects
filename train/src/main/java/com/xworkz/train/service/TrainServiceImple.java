package com.xworkz.train.service;

import com.xworkz.train.repository.TrainRepoImplements;
import com.xworkz.train.repository.TrainRepoInter;

public class TrainServiceImple implements TrainServiceInter{
	
	TrainRepoInter trainrepo = new TrainRepoImplements();

	@Override
	public String saveTrain(String name, String number, String trainType, String destination, String location) throws Exception {
		
	    int value = trainrepo.saveTrain(name, number, trainType, destination, location);
	
		if(value==1) {
			return "data saved successfully";
		}
		return "can't restore data";
	
	}
}
