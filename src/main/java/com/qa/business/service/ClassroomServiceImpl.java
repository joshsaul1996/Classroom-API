package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomRepository;
import com.qa.persistence.util.JSONUtil;

public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	ClassroomRepository classRepository;
	
	@Inject
	private JSONUtil json;

	public String getAllClassrooms() {
		return classRepository.getAllClassrooms();
	}

	public String createClassroom(String classroom) {
		classRepository.createClassroom(classroom);
				return "{message\" : \"This classroom has been created\"}";
	}

	public String deleteClassroom(Long classroomID) {
		classRepository.deleteClassroom(classroomID);
		return "{message\" : \"This classroom has been deleted\"}";
	}
	

	public String updateClassroom(Long classroomID, String classroom) {
		classRepository.updateClassroom(classroomID, classroom);
		return "{message\" : \"This classroom has been updated\"}";
	}
}