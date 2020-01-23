package com.robomq.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerJdbc {

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int custid;
	String fname;
	String lname;
	String address;
	String email;
	Scanner sc = new Scanner(System.in);

	public CustomerJdbc()

	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Nupur12345");
			System.out.println("Database Connected....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert()

	{
		try {
			System.out.println("Enter Customer Id:");
			custid = sc.nextInt();
			System.out.println("Enter First Name:");
			fname = sc.next();
			System.out.println("Enter Last Name:");
			lname = sc.next();
			System.out.println("Enter Address:");
			address = sc.next();
			System.out.println("Enter Email id:");
			email = sc.next();

			pre = con.prepareStatement("insert into Customer values(?,?,?,?,?)");
			pre.setInt(1, custid);
			pre.setString(2, fname);
			pre.setString(3, lname);
			pre.setString(4, address);
			pre.setString(5, email);

			int ra = pre.executeUpdate();
			if (ra > 0)
				System.out.println("Customer Details Committed..");
			else
				System.out.println("Customer Details Not Committed..");
			pre.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printCustomerDetails() {
		try {
			stat = con.createStatement();
			res = stat.executeQuery("select * from Customer");
			while (res.next()) {
				System.out.println("Customer Id : " + res.getInt("Customer_id"));
				System.out.println("First Name : " + res.getString("Customer_fname"));
				System.out.println("Last Name : " + res.getString("Customer_lname"));
				System.out.println("Address : " + res.getString("Address"));
				System.out.println("Email : " + res.getString("Email"));

				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateCustomerDetails() {
		try {
			System.out.println("Enter Customer Id:");
			custid = sc.nextInt();
			System.out.println("Enter First Name:");
			fname = sc.next();
			System.out.println("Enter Last Name:");
			lname = sc.next();
			System.out.println("Enter Address:");
			address = sc.next();
			System.out.println("Enter Email:");
			email = sc.next();
			pre = con.prepareStatement("Update Customer set Customer_fname=?,Customer_lname=?,Address=?,Email=?  where Customer_id= ?");
			
			pre.setString(1, fname); 
			pre.setString(2, lname);
			pre.setString(3, address); 
			pre.setString(4, email); 
			pre.setInt(5, custid);  
			
			int ra = pre.executeUpdate();
			if (ra > 0)
				System.out.println("Name updated");
			else
				System.out.println("Name not updated..");
			pre.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomerDetails() {
		try {

			System.out.println("Enter Customer Id you want to delete:");
			custid = sc.nextInt();
			pre = con.prepareStatement("delete from Customer where Customer_id=?");
			pre.setInt(1, custid);
			int ra = pre.executeUpdate();
			if (ra > 0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);
		CustomerJdbc custrecord = new CustomerJdbc();

		while (true) {
			System.out.println(
					"Enter your choice(1-5):\n1.Insert Cutomer\n2.Update Customer\n3.Delete Customer\n4.Print Customer\n5.Exit Application");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				custrecord.insert();
				break;
			case 2:
				custrecord.updateCustomerDetails();
				break;
			case 3:
				custrecord.deleteCustomerDetails();
				break;
			case 4:
				custrecord.printCustomerDetails();
				break;
			case 5:
				System.out.println("Exited Successfully");
				System.exit(0);
				break;
			default:
				System.out.println("Make Correct Choice");

			}
		}

	}

}
