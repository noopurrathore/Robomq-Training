package com.robomq.assignment3;
import java.util.HashSet;

public class HashSetElection {

	public static void main(String[] args) {
		HashSet<Election> elec = new HashSet<Election>();        
        Election e1=new Election(1,"colonial","1-03-2020","Balham","xyz","20-03-2020");
        Election e2=new Election(2,"monarch","2-02-2020","Barbican","jkl","22-02-2020");
        Election e3=new Election(3,"communal","3-11-2020","Charlton","dfg","23-11-2020");
        Election e4=new Election(4,"democrats","1-10-2020","Edgware","qwe","20-10-2020");
        Election e5=new Election(1,"colonial","2-02-2020","Dalston","abc","24-02-2020");
        elec.add(e1);
        elec.add(e2);
        elec.add(e3);
        elec.add(e4);
        elec.add(e5);
		System.out.println(elec);
		/*
		 * for(Election x:elec) {
		 * 
		 * }
		 */

	}

}
