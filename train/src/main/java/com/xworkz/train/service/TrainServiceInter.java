package com.xworkz.train.service;

public interface TrainServiceInter {

	String saveTrain(String name, String number, String trainType, String destination, 
			String location) throws Exception;

}
