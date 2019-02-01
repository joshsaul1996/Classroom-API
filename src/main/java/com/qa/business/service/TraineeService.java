package com.qa.business.service;

public interface TraineeService {
	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Long traineeID);
	String updateTrainee(Long traineeID, String trainee);
	
}

