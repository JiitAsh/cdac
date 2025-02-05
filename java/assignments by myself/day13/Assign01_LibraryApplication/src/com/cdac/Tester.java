package com.cdac;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		System.out.println("Hello Programmer :)");
		Scanner sc = new Scanner(System.in);
//		String b1Type = BookType.TECHNICAL.toString();
//		Book b1 = new Book("Java: Head First",BookType.TECHNICAL.toString(),5000.0,LocalDate.now(), "Kethy Seiara", 10);
		
//		System.out.println(b1.toString());
//		Set<Book> bookSet = new HashSet<>();
//		bookSet.add(b1);
//		System.out.println(bookSet);
//		for(Book b:bookSet) {
//			System.out.println(b);
//		}
		
		
		Set<Book> bookSet = new HashSet<>();
		DataUtils.createSet(bookSet);
		for(Book b:bookSet) {
			System.out.println(b);
		}
		
		int option=0;
		do {
			ConsolePrinter.showMenu();
			
			System.out.print("\nEnter Option: ");
			option = sc.nextInt();
			sc.nextLine();
			System.out.println(); // for line break
			
			
			switch(option) {
			case 1:{
				ConsolePrinter.addBook(bookSet, sc);
			}break;
			case 2:{
				for(Book b:bookSet) {
					System.out.println(b);
				}
			}break;
			case 3:{
				ConsolePrinter.allotBook(bookSet, sc);
			}break;
			case 4:{
				ConsolePrinter.returnBook(bookSet, sc);
			}break;
			case 5:{
				ConsolePrinter.removeBook(bookSet, sc);
			}break;
			case 0:{
				System.out.print("Have Nice Day :)");
			}break;
			}
		}while(option!=0);
		
		
		sc.close();
	}

}
