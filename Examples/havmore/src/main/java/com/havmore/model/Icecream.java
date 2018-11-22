package com.havmore.model;

public class Icecream {
	private int pid, price;
	private String name, category;

	public Icecream() {
		// TODO Auto-generated constructor stub
	}

	public Icecream(int pid, int price, String name, String category) {
		super();
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.category = category;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {

		return this.name + " \t " + this.price;
	}

}
