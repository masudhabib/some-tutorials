package com.netflix.something;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplicationDriver {

	public static void main(String[] args) {
/*		Author author = new Author(1010, "Remarque", "Erich", "Germany", (short) 100);
		Book book = new Book(1, "All Quiet On The Western Front", author, (short)1, 1955);
		System.out.println(book);
		
		book.getAuthor().setFirstName("Maria");
		System.out.println(book);
	System.out.println(author);*/
		Book book1 = new Book(
				1,
				"All Quiet On The Western Front",
				new Author(
						1010,
						"Remarque",
						"Erich",
						"Germany",
						(short) 100
				),
				(short)1,
				1955
				);
		Book book2 = new Book(
				5,
				"Crime and Punishment",
				new Author(
						1,
						"Dostoyevsky",
						"Fyodor",
						"Russia",
						(short) 1000
				),
				(short)2,
				1866
				);
		
		Book book3 = new Book(
				3,
				"Things Fall Apart",
				new Author(
						10,
						"Chinua",
						"Achebe",
						"Nigeria",
						(short) 200
				),
				(short)5,
				1958
				);
		
		/*List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);*/
		
		List<Book> books = Arrays.asList(book1, book2, book3);
		//System.out.println(books);
		/*for(Book book : books) {
			System.out.println(book);
		}*/
		
		Collections.sort(books, new BookComparatorbyAuthorLastName());
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		Collections.sort(books, new BookComparatorByFirstName());
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		/*Set<Book> bookSetSorted = new TreeSet<>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPublishedYear().compareTo(o2.getPublishedYear());
			}
		});*/
		/*Set<Book> bookSetSorted = new TreeSet<>(
			(bk1, bk2) -> bk1.getPublishedYear().compareTo(bk2.getPublishedYear())
		);
		
		bookSetSorted.addAll(books);*/
		Set<Book> bookSet = new HashSet<>();
		bookSet.addAll(books);
		
		
		
		
		
		
		
		
		
		
		
	}

}
