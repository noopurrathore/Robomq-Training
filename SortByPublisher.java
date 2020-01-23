package com.robomq.book;
import java.util.Comparator;
public class SortByPublisher implements Comparator<Book>{
	public int compare(Book x, Book y) {
		String publisher1=x.getName();
		String publisher2=y.getName();
		int r = publisher1.compareTo(publisher2);
		return r;
	}

}
