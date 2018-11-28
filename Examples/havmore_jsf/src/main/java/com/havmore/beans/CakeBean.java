package com.havmore.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.havmore.havmoreDao.CakeDao;
import com.havmore.havmoreDao.CakeDaoImpl;
import com.havmore.model.Cake;

@ManagedBean(name = "cake")
@RequestScoped
public class CakeBean {

	private String name;
	private int price;
	private String quantity;
	private String msg;

	public CakeBean() {
		// TODO Auto-generated constructor stub
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String addCake() {
		System.out.println(this.name);

		Cake cake = new Cake(this.name, this.price, this.quantity);

		CakeDao dao = new CakeDaoImpl();
		dao.insertCake(cake);

		return "index.jsp";

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
