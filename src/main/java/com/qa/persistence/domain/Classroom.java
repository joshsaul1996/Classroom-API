package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long classroomID;
	@Column(length =45)
	private String trainer;
	
	public Classroom() {
		
	}

	public Classroom(Long classroomID, String trainer) {
		super();
		this.classroomID = classroomID;
		this.trainer = trainer;
	}

	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	
	
}
	