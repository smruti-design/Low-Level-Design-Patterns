package com.sdw.builder;

public class Director {
	
	StudentBuilder studentBuilder;
	
	Director(StudentBuilder studentBuilder) {
		this.studentBuilder = studentBuilder;				
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudentBuilder();
		}
		return null;
	}
	
	private Student createEngineeringStudentBuilder() {
		return studentBuilder.setAge(24).setRoll(52).setName("Smruti").build();
	}

}
