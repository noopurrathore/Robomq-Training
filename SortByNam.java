package com.robomq.book;
import java.util.Comparator;
public class SortByNam implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		String name1=b1.getName();
		String name2=b2.getName();
		int r = name1.compareTo(name2);
		return r;
	}
	
}
