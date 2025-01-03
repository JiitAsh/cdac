package com.cdac.acts;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class FruitTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Fruits> fruitList = new ArrayList<>();
		
		Fruits f1 = new Fruits("Apple","Red",23.04,3);
		Fruits f2 = new Fruits("Banana","Yellow",12.84,33);
		Fruits f3 = new Fruits("Chiku","Brown",13.08,21);
		Fruits f4 = new Fruits("Guava","Green",20.04,53);
		Fruits f5 = new Fruits("Papaya","Orange",200.23,5);
		
		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add(f3);
		fruitList.add(f4);
		fruitList.add(f5);
		
		// printing
		System.out.println("\n********Print whole arraylist in system.out.println()*********");
		System.out.println(fruitList);
		
		// printing using get().toString in a loop
		System.out.println("\n********Print single element uisng loop*********");
		for(int i=0;i<fruitList.size();i++) {
			System.out.println(fruitList.get(i).toString());
		}
		
		
		// enhanced for loop
		System.out.println("\n********Print using enhanced for loop*********");
		for(Fruits fr:fruitList) {
			System.out.println(fr);
		}
		
		// forEach loop
		System.out.println("\n********Print using forEach loop*********");
		fruitList.forEach(System.out::println);
		
		// using forward iterator
		System.out.println("\n********Print using forward iterator*********");
		ListIterator<Fruits> fit = fruitList.listIterator();
		while(fit.hasNext()) {
			Fruits fr = fit.next();
			System.out.println(fr);
		}
		
		// using backward iterator
		System.out.println("\n********Print using backward iterator*********");
		ListIterator<Fruits> bit = fruitList.listIterator(fruitList.size());
		while(bit.hasPrevious()) {
			Fruits fr = bit.previous();
			System.out.println(fr);
		}
		
		
		System.out.print("\nEnter fruit name: ");
		String frName = sc.nextLine();
		
		System.out.print("Enter fruit color: ");
		String frColor = sc.nextLine();
		
		System.out.print("Enter fruit price: ");
		Double frPrice = sc.nextDouble();
		
		System.out.print("Enter quantity: ");
		Integer frQuant = sc.nextInt();
		
		Fruits addFr = new Fruits(frName, frColor, frPrice, frQuant);
		fruitList.add(addFr);
		
		System.out.println("\n*****List after adding a new fruit********");
		fruitList.forEach(System.out::println);
		
		// removing fruit using index
		int lastIndex = fruitList.size()-1;
		
		System.out.print("\nEnter fruit index you want to remove between 0 to " + lastIndex + " : ");
		int removeIndex = sc.nextInt();
		fruitList.remove(removeIndex);
		
		System.out.println("\n********After removal**********");
		fruitList.forEach(System.out::println);
		
		
		sc.close();
		
	}

}
