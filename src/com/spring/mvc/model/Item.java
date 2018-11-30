package com.spring.mvc.model;

import java.util.Arrays;

public class Item {

	private String name;
	private double price;
	private int id;
	private int[] checkedIdList;
	private int quantity;

	public Item() {
	}

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int[] getCheckedIdList() {
		return checkedIdList;
	}

	public void setCheckedIdList(int[] checkedIdList) {
		this.checkedIdList = checkedIdList;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", id=" + id + ", checkedIdList="
				+ Arrays.toString(checkedIdList) + ", quantity=" + quantity + "]";
	}

}
