package com.robomq;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robomq.config1.AppConfig;
import com.robomq.dao1.MobileDAO;
import com.robomq.pojo1.Mobile;

public class MobileJDBCMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MobileDAO mobileDAO = context.getBean(MobileDAO.class);
		System.out.println("List of Mobiles is:");
		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}
		// Displaying details with id
		System.out.println("\nGet Mobile with ID.\nEnter the id:");
		int id = sc.nextInt();
		Mobile mobileById = mobileDAO.getMobileById(id);
		System.out.println(mobileById);

		// Creating new mobile record
		System.out.println("\nCreating Mobile Record: ");
		System.out.println("Enter mobile id:");
		int id1 = sc.nextInt();
		System.out.println("Enter mobile name:");
		String name = sc.next();
		System.out.println("Enter mobile price:");
		int price = sc.nextInt();
		System.out.println("Enter mobile quantity:");
		int qty = sc.nextInt();
		System.out.println("Enter mobile description:");
		String desc = sc.next();
		Mobile mobile = new Mobile(id1, price, qty, name, desc);
		System.out.println(mobile);
		mobileDAO.createMobile(mobile);
		System.out.println("Record Created.");
		
		//Deleting mobile record
		System.out.println("\nEnter the Mobile id to be deleted:");
		int id2 = sc.nextInt();
		Mobile mobileById1 = mobileDAO.getMobileById(id2);
		mobileDAO.deleteMobile(mobileById1);
		System.out.println("Record Deleted.");
		
		//Update mobile record
		System.out.println("Enter mobile id to be updated:");
		int id3 = sc.nextInt();
		System.out.println("Enter mobile name:");
		String name_new = sc.next();
		System.out.println("Enter mobile price:");
		int price_new = sc.nextInt();
		System.out.println("Enter mobile quantity:");
		int qty_new = sc.nextInt();
		System.out.println("Enter mobile description:");
		String desc_new = sc.next();
		Mobile mmobile = mobileDAO.getMobileById(id3);
		mmobile.setName(name_new);
		mmobile.setPrice(price_new);
		mmobile.setQty(qty_new);
		mmobile.setDesc(desc_new);
		mobileDAO.updateMobile(mobile);
		
	}

}
