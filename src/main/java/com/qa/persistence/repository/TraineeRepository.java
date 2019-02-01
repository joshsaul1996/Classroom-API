package com.qa.persistence.repository;

public interface TraineeRepository {
	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Long traineeID);
	String updateTrainee(Long traineeID, String trainee);
	
}
