package com.sdw.builder;

import java.util.List;

public class Student {
	
	int roll;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String> subjects;
	
	public Student(StudentBuilder builder) {
		this.age = builder.age;
		this.roll = builder.roll;
		this.name = builder.name;
		this.fatherName = builder.fatherName;
		this.motherName = builder.motherName;
		this.subjects = builder.subjects;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", subjects=" + subjects + "]";
	}

}
