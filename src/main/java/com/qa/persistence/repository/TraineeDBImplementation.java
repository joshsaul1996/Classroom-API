package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.util.JSONUtil;

@Default
@Transactional(SUPPORTS)
public class TraineeDBImplementation implements TraineeRepository {

	@PersistenceContext (unitName = "primary")
	private EntityManager eManager;
	
	@Inject
	private JSONUtil json;
	
	public String getAllTrainees() {
		TypedQuery<Trainee> query = eManager.createQuery("SELECT t FROM Trainee t", Trainee.class);
		return json.getJSONForObject(query.getResultList());
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
