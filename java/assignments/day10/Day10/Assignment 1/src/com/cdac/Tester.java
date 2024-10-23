package com.cdac;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class Tester {
	
	public static void addFruits(ArrayList<Fruit> fruitList,Scanner sc) {
		System.out.print("Please enter the fruit name: ");
		String name=sc.nextLine();
		System.out.print("Please enter the fruit colour: ");
		String clr=sc.nextLine();
		System.out.print("Please enter the fruit price: ");
		double price=sc.nextDouble();
		System.out.print("Please enter the fruit quantity: ");
		int quantity=sc.nextInt();
//		sc.nextInt();
//		sc.nextLine();
		Fruit fr=new Fruit(name,clr,price,quantity);
		fruitList.add(fr);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Fruit> fruitList = new ArrayList<> ();
		
		addFruits(fruitList,sc);
//		System.err.println();
//		System.out.println(fruitList);


		
		// advanced for loop
		for(Fruit f : fruitList){
//		System.out.println(f.toString());   
        System.out.println(f);  // both will give same output
		}
		
		
		//for each
		fruitList.forEach(System.out::println);
		
		
		
		// Forward iterator
		ListIterator<Fruit> it = fruitList.listIterator();
		while(it.hasNext()) {
			Fruit fr = it.next();
			System.out.println(fr);
		}
		
		
		// Reverse iterator
		ListIterator<Fruit> itb = fruitList.listIterator(fruitList.size());
		while(itb.hasPrevious()) {
			Fruit fr = itb.previous();
			System.out.println(fr);
		}
		
		
		//Remove fruit by index
		fruitList.remove(0);
		System.out.println("After removal through index");
		
//		ListIterator<Fruit> itr = fruitList.listIterator();
//		while(it.hasNext()) {
//			Fruit fr = itr.next();
//			System.out.println(fr);
//		}
		
		
		sc.close();
	}

}
