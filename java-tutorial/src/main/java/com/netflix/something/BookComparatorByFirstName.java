package com.netflix.something;

import java.util.Comparator;

public class BookComparatorByFirstName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().getFirstName().compareTo(o2.getAuthor().getFirstName());
	}

}
