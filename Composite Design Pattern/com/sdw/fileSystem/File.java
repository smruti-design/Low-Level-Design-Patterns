package com.sdw.fileSystem;

public class File implements FileSystem{
	public File(String fileName) {
		super();
		this.fileName = fileName;
	}

	String fileName;

	@Override
	public void ls() {
		System.out.println("file Name : "+ fileName);
	}

}
