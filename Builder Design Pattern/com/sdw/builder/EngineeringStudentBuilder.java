package com.sdw.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
	
	public StudentBuilder setSubjects() {
		List<String> list = new ArrayList<>();
		list.add("DSA");
		list.add("OS");
		return this;
	}
	
	//you can set age , roll number, name etc ...

}
