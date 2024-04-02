package com.sdw.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	
	String directoryName;
	List<FileSystem> lists ;
	
	public Directory(String directoryName) {
		super();
		this.directoryName = directoryName;
		lists = new ArrayList<>();
	}
	
	public void add(FileSystem obj) {
		lists.add(obj);
	}
	

	@Override
	public void ls() {
		System.out.println("Directory name : "+ directoryName);
		
		for(FileSystem obj : lists) {
			obj.ls();
		}
	}

}
