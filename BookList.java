package com.robomq.book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookList {
	
	public static void main(String[] args) {
		
	ArrayList<Book> books=new ArrayList<Book>();
	
	books.add(new Book(1,"cab","Noopur","xyz",5));
	books.add(new Book(2,"aab","Aakriti","jkl",8));
	books.add(new Book(3,"bak","Kanak","fgh",10));
	books.add(new Book(4,"dkl","Smriti","wsc",15));
	System.out.println(books);
	
	Iterator itr=books.iterator();
	while(itr.hasNext()) {
		Object obj=itr.next();
		Book b=(Book)obj;
		System.out.println(b.getName());
	}
		
		char choice;
		Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter choice by which you want to sort\n(a. Sort by Name \n b. Sort by author \n c. Sort by publisher): ");
    	choice = scanner.next().charAt(0);
    	switch(choice) {
    	case 'a':
    		System.out.println("\nSorted By Book's Name \n");
    		SortByNam s=new SortByNam();
    		books.sort(s);
    		System.out.println(books);
            break;
    	case 'b':
    		System.out.println("\nSorted By Book's Author \n");
    		SortByAuthor s1=new SortByAuthor();
    		books.sort(s1);
    		System.out.println(books);
            break;
    	case 'c':
    		System.out.println("\nSorted By Book's Publisher \n");
    		SortByPublisher s2=new SortByPublisher();
    		books.sort(s2);
    		System.out.println(books);
            break;
            default:
            	 System.out.println("Please enter from a, b and c..!!");
            	 break;
    	}
  }
}