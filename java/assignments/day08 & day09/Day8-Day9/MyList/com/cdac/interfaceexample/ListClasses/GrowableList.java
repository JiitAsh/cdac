package com.cdac.interfaceexample.ListClasses;

import com.cdac.interfaceexample.Mylist;

public class GrowableList implements Mylist{
	private int size;
	private int arr[];
	private int currentindx;
	
	public GrowableList() 
	{
		this.size = 5;
		this.arr = new int[size];
		this.currentindx = 0;
		
	}
	
	@Override
	public void insert(int elements) {
		if(currentindx == size) {
			size = size*2;
			int temp[] = new int[size];
			for(int i = 0; i < currentindx; i++) {
					temp[i] = arr[i];
			}
			arr = temp;
		}
		arr[currentindx++] = elements;
	}
	@Override
	public int retrive(int index) {
		return arr[index];
	}
}
