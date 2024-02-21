package com.sdw.builder;

public class Client {
	
	public static void main(String[] args) {
		
		Director dir1 = new Director(new EngineeringStudentBuilder());
		
		Student enggStudent = dir1.createStudent();
		
		System.out.println(enggStudent.toString());
	}

}
