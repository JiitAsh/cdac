package com.cdac.interfaceexample.ListClasses;
import com.cdac.interfaceexample.Exception.*;


import java.util.Arrays;

import com.cdac.interfaceexample.Mylist;
import com.cdac.interfaceexample.Exception.ArrayIndexFull;
public class FixedList implements Mylist{
	private final int size;
	private int arr[];
	private int currentindx;
	
	public FixedList() {
		this.size = 3;
		this.arr = new int[size];
		this.currentindx = 0;
	}
	
	@Override
	public void insert(int element) throws ArrayIndexFull {
		if(currentindx == size) {
			throw new ArrayIndexFull("list is full");
		}
		
		arr[currentindx++] = element;
 	}
	@Override
	public int retrive(int index) {
		if( index < 0  && index > size ) {
			System.out.println("Array Index out of bound Exception");
			return 0;
		}
		return arr[index];
 	}
}
