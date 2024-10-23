package com.cmart;
import com.cmart.Item;
public class Customer{
	private int itemCode[] = new int[10];
	private int quantity[] = new int[10];
	
	private static int index = 0;
	
	public Customer(){
	}
	public void putItem(int itemCode, int quantity){
		this.itemCode[index] = itemCode;
		this.quantity[index] = quantity;
		index++;
	}
	
	public int getItemCode(int index){
		return this.itemCode[index];
	}
	
	public int getQuantity(int index){
		return this.quantity[index];
	}
}