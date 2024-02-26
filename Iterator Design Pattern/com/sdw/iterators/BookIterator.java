package com.sdw.iterators;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator{
	
	private List<Book> books;
	private int index;

	public BookIterator(List<Book> books) {
		super();
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return index < books.size();
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			return books.get(index++);
		}
		return null;
	}

}
