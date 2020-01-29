package com.robomq.pojo1;

public class Mobile {
	public Mobile() {

	}

	public Mobile(int id, int price, int qty, String name, String desc) {
		super();
		this.id = id;
		this.price = price;
		this.qty = qty;
		this.name = name;
		this.desc = desc;
	}

	private int id, price, qty;
	private String name, desc;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", price=" + price + ", qty=" + qty + ", name=" + name + ", desc=" + desc + "]";
	}

}
