package com.cdac.interfaceexample;

import com.cdac.interfaceexample.Exception.ArrayIndexFull;

public interface Mylist {
	
	void insert(int element) throws ArrayIndexFull;
	int retrive(int index);
}
