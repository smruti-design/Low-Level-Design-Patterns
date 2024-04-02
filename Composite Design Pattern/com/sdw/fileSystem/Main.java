package com.sdw.fileSystem;

public class Main {

	public static void main(String[] args) {

		Directory movie = new Directory("Movie");
		
		FileSystem border = new File("Border");
		movie.add(border);
		
		Directory comedy = new Directory("Comedy Movie");
		File golmaal = new File("Golmaal");
		comedy.add(golmaal);
		movie.add(comedy);
		
		movie.ls();
		
	}

}
 