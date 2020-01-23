package com.robomq.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerCreateTable {
	public static void main(String[] args) {
		try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Nupur12345");
            System.out.println("Database Connected....");
            
            CallableStatement stat=(CallableStatement) con.prepareCall("create table Customer (Customer_Id int, FirstName varchar(50), LastName varchar(50),"
                    + "Address varchar(200),Email varchar(20))");
           
            boolean result=stat.execute();
            if(!result)
                System.out.println("Table Created....");
            else
                System.out.println("Table Not Created....");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }	
	}
	}


