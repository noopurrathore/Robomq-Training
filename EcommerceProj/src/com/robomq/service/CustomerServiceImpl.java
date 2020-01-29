package com.robomq.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.robomq.dao.DBConnection;
import com.robomq.pojo.Customer;

public class CustomerServiceImpl implements CustomerService {
	Connection con;
	PreparedStatement pre;
	int ra;
	ResultSet res;
	boolean flag = false;

	public CustomerServiceImpl() {
		con = DBConnection.getConnection();
	}

	// Register a New Customer
	public boolean createCustomer(Customer c) {
		try {

			pre = con.prepareStatement("insert into CustomerTable values(?,?,?,?,?)");
			pre.setInt(1, c.getId());
			pre.setString(2, c.getName());
			pre.setString(3, c.getEmail());
			pre.setString(4, c.getAddress());
			pre.setString(5, c.getMobileno());

			ra = pre.executeUpdate();
			if (ra > 0)
				flag = true;
			else
				flag = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	// Login a customer
	public boolean login(int cid, String name) {
		try {
			pre = con.prepareStatement("SELECT cid,name FROM CustomerTable WHERE cid=? AND name=?");
			pre.setInt(1, cid);
			pre.setString(2, name);
			res = pre.executeQuery();
			if (res.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Display Customer Details
	public ResultSet displayCustomer(int cid) {
		try {
			pre = con.prepareStatement("select * from CustomerTable where cid=?");
			pre.setInt(1, cid);
			res = pre.executeQuery();
			while (res.next()) {
				System.out.println("Customer Id:" + res.getInt("CID"));
				System.out.println("Customer Name:" + res.getString("Name"));
				System.out.println("Customer Email:" + res.getString("Email"));
				System.out.println("Customer Address:" + res.getString("Address"));
				System.out.println("Customer Mobile:" + res.getInt("MobileNo"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	// Update Customer Details
	public boolean updateCustomer(int cid, String email, String address, int mob) {
		try {
			pre = con.prepareStatement("select * from CustomerTable where cid=?");
			pre.setInt(1, cid);
			res = pre.executeQuery();
			if (email.equalsIgnoreCase("no")) {
				while (res.next()) {
					email = res.getString("Email");
				}
			}
			res = pre.executeQuery();
			if (address.equalsIgnoreCase("no")) {
				while (res.next()) {
					address = res.getString("Address");
				}
			}
			res = pre.executeQuery();
			if (mob == 2) {
				while (res.next()) {
					mob = res.getInt("MobileNo");
				}
			}
			pre = con.prepareStatement("Update CustomerTable set Email=?,Address=?,MobileNo=?  where CID= ? ");
			pre.setString(1, email);
			pre.setString(2, address);
			pre.setInt(3, mob);
			pre.setInt(4, cid);
			ra = pre.executeUpdate();
			if (ra > 0) {
				flag = true;
				System.out.println("Record Updated Successfully.");
			} else
				flag = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

// Deleting Customer Details
	public boolean deleteCustomer(int cid) {
		try {
			pre = con.prepareStatement("delete from CustomerTable where cid=?");
			pre.setInt(1, cid);
			int ra = pre.executeUpdate();
			if (ra > 0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}