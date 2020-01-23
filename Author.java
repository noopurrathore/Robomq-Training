package com.robomq.assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Author {
	public static void main(String[] args) {
		HashMap<String,AuthorList>authors=new HashMap<String,AuthorList>();
		authors.put("GULLIVER TRAVELS",new AuthorList(1,"Jonathan Swift","Plot 24 civil lines"));
		authors.put("THE GREAT GATSBY",new AuthorList(2,"F. Scott Fitzgerald","Plot 14 Pratap Nagar"));
		authors.put("BRAVE NEW WORLD",new AuthorList(3,"Aldous Huxley","Plot 2 Vaishali"));
		authors.put("THE SOUND AND THE FURY",new AuthorList(4,"William Faulkner","11/12 mansarovar"));
		authors.put("A TALE OF A TUB",new AuthorList(1,"Jonathan Swift","Plot 24 civil lines"));
		
		
		Set<String>keys=authors.keySet();
		for(String i:keys) {
			System.out.println(i+" Written by "+authors.get(i).getName());
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> keys1 = authors.keySet();
		AuthorList author;
		for (String s : keys1) {
			author = authors.get(s);
			String s1 = author.getName();

			if (!map.containsKey(s1)) {
				map.put(s1, 1);
			} else {
				int count = map.get(s1);
				map.put(s1, count + 1);
				System.out.println(s1);
			}
		}
		
	}

}
