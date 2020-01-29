package com.robomq.pojo;

public class Order {
	private int oid;
	private int pid;
	private int amount;
	private String orderdate;
	public Order() {
		
	}
	
	public Order(int oid, int pid, int amount, String orderdate) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.amount = amount;
		this.orderdate = orderdate;
	}

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", pid=" + pid + ", amount=" + amount + ", orderdate=" + orderdate + "]";
	}
	

}
