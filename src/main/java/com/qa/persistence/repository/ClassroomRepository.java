package com.qa.persistence.repository;

public interface ClassroomRepository {
	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Long classroomID);
	String updateClassroom(Long classroomID, String classroom);
	
}
