package com.cdac;
import java.util.Set;
import java.time.LocalDate;
import java.util.Scanner;
public class ConsolePrinter {
	public static void showMenu() {
		System.out.println("\n*******Select Option********");
		System.out.println("1.Add Book."
				+ "\n2.Display All Book."
				+ "\n3.Allot Book."
				+ "\n4.Receive Book."
				+ "\n5.Remove Book."
				+ "\n0.Exit");
	}
	
	public static void addBook(Set<Book> bookSet,Scanner sc) {

		System.out.print("\nEnter Book Title: ");
		String title = sc.nextLine();
		
		System.out.print("Enter Book Type: ");
		String bookType = sc.nextLine();
		bookType = bookType.toUpperCase();
		BookType bookTypeEnum = BookType.valueOf(bookType);
		
		System.out.print("Enter price: ");
		Double price = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter Published Date(YYYY-MM-DD): ");
		String date = sc.nextLine();
		LocalDate publishedDate = LocalDate.parse(date);
		
		System.out.print("Enter Author Name: ");
		String authorName = sc.nextLine();
		
		System.out.print("Enter Quantity: ");
		Integer quantity = sc.nextInt();
		
		Book newBook = new Book(title, bookTypeEnum, price, publishedDate, authorName, quantity);
		
		bookSet.add(newBook);
		
		System.out.println("Book Added Successfully!!\n");
	}

	public static void allotBook(Set<Book> bookSet, Scanner sc) {
		System.out.print("\nEnter Book Title: ");
		String title = sc.nextLine();
		
		for(Book b:bookSet) {
			if(title.equals(b.getTitle())) {
				b.setQuantity(b.getQuantity()-1);
				break;
			}
		}
		System.out.println();
	}
	
	public static void returnBook(Set<Book> bookSet, Scanner sc) {
		System.out.print("\nEnter Book Title: ");
		String title = sc.nextLine();
		
		for(Book b:bookSet) {
			if(title.equals(b.getTitle())) {
				b.setQuantity(b.getQuantity()+1);
				break;
			}
		}
		System.out.println();
	}
	
	public static void removeBook(Set<Book> bookSet, Scanner sc) {
		System.out.print("\nEnter Book Title: ");
		String title = sc.nextLine();
		
		for(Book b:bookSet) {
			if(title.equals(b.getTitle())) {
				bookSet.remove(b);
				break;
			}
		}
		System.out.println("\nBook Removed Successfully!!");
	}



}
