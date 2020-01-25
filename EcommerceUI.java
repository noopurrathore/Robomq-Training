package com.robomq.ecomUI;

import java.util.Scanner;
import com.robomq.pojo.Customer;
import com.robomq.service.CustomerService;
import com.robomq.service.CustomerServiceImpl;

public class EcommerceUI {
	Customer c;
	Scanner sc;
	CustomerService service;
	
	public EcommerceUI() {
		sc=new Scanner(System.in);
		c=new Customer();
		service=new CustomerServiceImpl();
	}
	public void registerCustomer() {
		System.out.println("Enter customer id:");
		c.setId(sc.nextInt());
		System.out.println("Enter customer name:");
		c.setName(sc.next());
		System.out.println("Enter customer email:");
		c.setEmail(sc.next());
		System.out.println("Enter customer address:");
		c.setAddress(sc.next());
		System.out.println("Enter customer mobileno:");
		c.setMobileno(sc.next());
		if(service.createCustomer(c))
			System.out.println("Customer registered successfully");
		else
			System.out.println("Customer not registered..");
			
	}
	
	//login	
	public void loginCustomer() {
		System.out.println("Enter Customer id.");
		int cid = sc.nextInt();
		System.out.println("Enter Customer Name.");
		String name = sc.next();
		if (service.login(cid, name)) {
			System.out.println("Login Successfully");
			System.out.println("Your Details Stored with us:");
			service.displayCustomer(cid);
			System.out.println("Do you want to update details?(1.yes/2.no)");
			
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter New Customer email.(if don't want to update type no)");
				String email = sc.next();
				System.out.println("Enter New Customer address.(if don't want to update type no)");
				String address = sc.next();
				System.out.println("Enter New Customer Mobileno.(if don't want to update type 2)");
				int mobileno = sc.nextInt();
				service.updateCustomer(cid, email, address, mobileno);
			} else
				System.exit(0);
		}

		else
			System.out.println("Incorrect Credentials..");
	}

	public void viewCustomer() {
		System.out.println("Enter Customer id.");
		int cid = sc.nextInt();
		service.displayCustomer(cid);
	}

	public void deleteCustomer() {
		System.out.println("Enter Customer id. to be deleted");
		int cid = sc.nextInt();
		service.deleteCustomer(cid);
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch=null;
		EcommerceUI e=new EcommerceUI();
		while(true) {
			System.out.println("Enter Your Choice");
			System.out.println("1. Registring New Customer");
			System.out.println("2. Login as existing Customer");
			System.out.println("3. Print Customer Details");
			System.out.println("4. Delete a Customer");
			System.out.println("5. Exit");

			ch = sc.next();
			switch (ch) {
			case "1": {
				e.registerCustomer();
				break;
			}
			case "2": {
				e.loginCustomer();
				break;
			}
			case "3": {
				e.viewCustomer();
				break;
			}
			case "4": {
				e.deleteCustomer();
				break;
			}
			case "5": {
				System.exit(0);
			}
			default:
				System.out.println("Enter Valid Choice!");
			}
				
			}
	}

}
