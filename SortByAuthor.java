package com.robomq.book;
import java.util.Comparator;
public class SortByAuthor implements Comparator<Book>{
	public int compare(Book a, Book b) {
		String author1=a.getName();
		String author2=b.getName();
		int r = author1.compareTo(author2);
		return r;
	}
}
