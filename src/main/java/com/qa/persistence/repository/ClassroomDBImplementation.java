package com.qa.persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.util.JSONUtil;

import static javax.transaction.Transactional.TxType.*;

@Default
@Transactional(SUPPORTS)
public class ClassroomDBImplementation implements ClassroomRepository {

	@PersistenceContext (unitName = "primary")
	private EntityManager eManager;
	
	@Inject
	private JSONUtil json;
	

	public String getAllClassrooms() {
		TypedQuery<Classroom> query = eManager.createQuery("SELECT c FROM Classroom c", Classroom.class);
		return json.getJSONForObject(query.getResultList());
	}

	
	@Transactional(REQUIRED)
	public String createClassroom(String classroom) {
		Classroom newClassroom = json.getObjectForJSON(classroom, Classroom.class);
		eManager.persist(newClassroom);
		return "{\"Message\": \"Classroom successfully added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long classroomID) {
		Classroom delClassroom = findClassroomByID(classroomID);
		if (classroomID != null) {
			eManager.remove(delClassroom);
			}
		return "{\"Message\": \"Classroom successfully deleted\"}";
		
	}
	

	@Transactional(REQUIRED)
	public String updateClassroom(Long classroomID, String classroom) {
		Classroom upClassroom = findClassroomByID(classroomID);
		if (upClassroom != null) {
			Classroom newClassroom = json.getObjectForJSON(classroom, Classroom.class);
			em.remove(upClassroom);
			em.persist(newClassroom);
			return "{\"message\": \"Classroom sucessfully updated\"}";
		return null;
	}
	
	private Classroom findClassroomByID(Long classroomID) {
		return eManager.find(Classroom.class, classroomID);
		
	}

}
