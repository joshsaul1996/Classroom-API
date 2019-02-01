package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long traineeID;
	@Column(length =45)
	private String traineeName;
	private Long classroomID;
	public Trainee(Long traineeID, String traineeName, Long classroomID) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		this.classroomID = classroomID;
	}
	public Long getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public Long getClassroomID() {
		return classroomID;
	}
	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}
	
	

}
