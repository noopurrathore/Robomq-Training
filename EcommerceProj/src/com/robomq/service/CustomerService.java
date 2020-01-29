package com.robomq.service;

import java.sql.ResultSet;

import com.robomq.pojo.Customer;

public interface CustomerService {

	public boolean createCustomer(Customer c);
	public ResultSet displayCustomer(int cid);
	public boolean login(int cid,String name);
	public boolean updateCustomer(int cid,String email, String address, int mob); 
	public boolean deleteCustomer(int cid);

}
