package com.cmart;
public class Item{
	public int itemCode;
	private String itemName;
	public double price;
	private int quantity;
	
	private static int itemCodeGenerator = 1001;
	
	public Item(){
		itemCode = itemCodeGenerator++;
		itemName = "";
		price = 0.0;
		quantity = 0;
		
	}
	
	public void addItem(String itemName, double price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	
	
	public String getItemDetails(){
		return "[ itemCode: " + Integer.toString(		itemCode)
				+ ", itemName: " + itemName 
				+ ", price: " + Double.toString(price)
				+ ", quantity: " + Integer.toString(quantity)
				+ " ]";
	}
	
}