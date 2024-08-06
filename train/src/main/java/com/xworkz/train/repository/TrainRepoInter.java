package com.xworkz.train.repository;

public interface TrainRepoInter {

	
	int saveTrain(String name,String number,String trainType,String destination,String location) throws Exception;
	
	

}
