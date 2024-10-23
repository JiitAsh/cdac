package com.acts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataPrinter {
	public static void printData(List<? extends Number> list) {
		Iterator<? extends Number> itr = list.iterator();
		System.out.println("****************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//itr.remove();
		}
	}

	public static void printData1(List<? super Integer> list) {
		Iterator<? super Integer> itr = list.iterator();
		System.out.println("****************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		
		List<Object> lo = new ArrayList<>(Arrays.asList(new int [] {1,2,3}));
		List<Number> ln = new ArrayList<>();
		ln.add(20.30);
		ln.add(30.30);
		List<Integer> lI = new ArrayList<>();
		lI.add(11);
		lI.add(22);
		//DataPrinter.printData(lo);
		DataPrinter.printData(ln);
		DataPrinter.printData(lI);
		
		
		DataPrinter.printData1(lo);
		DataPrinter.printData1(ln);
		DataPrinter.printData1(lI);
	}
	

}
