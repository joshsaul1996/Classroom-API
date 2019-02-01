package com.qa.business.service;

import javax.inject.Inject;


import com.qa.persistence.repository.TraineeRepository;
import com.qa.persistence.util.JSONUtil;

public class TraineeServiceImpl implements TraineeService {

	
	@Inject
	TraineeRepository traineeRepository;
	
	@Inject
	private JSONUtil json;

	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

	public String createTrainee(String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteTrainee(Long traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateTrainee(Long traineeID, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}
	
}