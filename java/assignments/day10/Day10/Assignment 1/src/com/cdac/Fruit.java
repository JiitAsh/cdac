package com.cdac;

public class Fruit {
	private String name;
	private String color;
	private double price;
	private int quantity;
	
	public Fruit() {
		name="";
		color="";
		price=0.0;
		quantity=0;
	}

	public Fruit(String name, String color, double price, int quantity) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void addFruit(String name, String color, double price, int quantity) {
			
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
}
