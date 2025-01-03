package com.cdac;
import java.util.Set;
import java.time.LocalDate;
import java.util.HashSet;
public class DataUtils {
	public static void createSet(Set<Book> bookSet){
		Book b1 = new Book("Java: Head First", BookType.TECHNICAL, 5000.0, LocalDate.of(2000,10,9), "Kethy Seiara", 10);

		Book b2 = new Book("The 5 Love Languages", BookType.SELF_HELP, 900.0, LocalDate.of(1995, 1, 1), "Gary Chapman", 25);

		Book b3 = new Book("Pride and Prejudice", BookType.ROMANTIC, 1500.0, LocalDate.of(1813, 1, 28), "Jane Austen", 20);

		Book b4 = new Book("Effective Java", BookType.TECHNICAL, 4500.0, LocalDate.of(2018, 1, 11), "Joshua Bloch", 15);

		Book b5 = new Book("The Catcher in the Rye", BookType.FICTION, 1200.0, LocalDate.of(1951, 7, 16), "J.D. Salinger", 30);

		Book b6 = new Book("Men Are from Mars, Women Are from Venus", BookType.SELF_HELP, 1200.0, LocalDate.of(1992, 4, 1), "John Gray", 18);

		Book b7 = new Book("The Notebook", BookType.ROMANTIC, 1000.0, LocalDate.of(1996, 10, 1), "Nicholas Sparks", 30);

		Book b8 = new Book("The Clean Coder", BookType.TECHNICAL, 3500.0, LocalDate.of(2011, 5, 13), "Robert C. Martin", 8);

		Book b9 = new Book("Gone with the Wind", BookType.FICTION, 2000.0, LocalDate.of(1936, 6, 30), "Margaret Mitchell", 25);

		Book b10 = new Book("The Power of Now", BookType.SELF_HELP, 950.0, LocalDate.of(1997, 8, 19), "Eckhart Tolle", 22);
		
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);
		bookSet.add(b6);
		bookSet.add(b7);
		bookSet.add(b8);
		bookSet.add(b9);
		bookSet.add(b10);

	
	}
}
