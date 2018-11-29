package com.havmore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coffee")
public class Coffee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;

	@Column
	private String name;

	@Column
	private int price;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
