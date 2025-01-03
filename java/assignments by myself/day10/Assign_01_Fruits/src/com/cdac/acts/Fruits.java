package com.cdac.acts;

public class Fruits {
	private String name;
	private String color;
	private Double price;
	private Integer quantity;
	
	public Fruits(String name, String color, Double price, Integer quantity) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Fruit [ Name=" + name
				+ " Color=" + color
				+ " Price=" + price
				+ " Quantity=" + quantity
				+ " ]";
	}
}
