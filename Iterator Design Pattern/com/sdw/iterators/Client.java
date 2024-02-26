package com.sdw.iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<Book> list = Arrays.asList(
				new Book(100, "Science"),
				new Book(200, "Math"),
				new Book(250, "SST")
				);
		
		Library lib = new Library(list);
		Iterator iterator = lib.createIterator();
		
		while(iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getBookName());
		}
				
	}

}
