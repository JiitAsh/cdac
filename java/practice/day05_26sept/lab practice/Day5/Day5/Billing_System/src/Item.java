package com.cdac.acts;

public class Item{
	private int itemCode;
    private String itemName;
	private double price;
	private int quantity;
	private static int counter=1001;
	public Item(){
		this.itemCode=counter++;
		this.quantity=0;
	}
	public Item(String name, double price, int quantity){
	    this.itemCode=counter++;
		this.itemName=name;
		this.price=price;
		this.quantity=quantity;	
	}
	
	public void get(String name, double price, int quantity){
		this.itemName=name;
		this.price=price;
		this.quantity=quantity;	
	}
	
	@Override
	public String toString(){
		return "ITEM NAME: " + this.itemName + ", ITEM CODE: " + this.itemCode + ", ITEM PRICE: " + this.price + ", ITEM QUANTITY: " + this.quantity; 
	}
}