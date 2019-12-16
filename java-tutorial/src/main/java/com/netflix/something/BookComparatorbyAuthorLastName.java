package com.netflix.something;

import java.util.Comparator;

public class BookComparatorbyAuthorLastName implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getAuthor().compareTo(book2.getAuthor());
	}

}
