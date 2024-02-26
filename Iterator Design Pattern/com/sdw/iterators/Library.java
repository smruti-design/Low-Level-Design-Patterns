package com.sdw.iterators;

import java.util.Iterator;
import java.util.List;

public class Library {

	private List<Book> list;
	
	public Library(List<Book> list) {
		this.list = list;
	}
	
	public Iterator createIterator() {
		return new BookIterator(list);
	}
}
