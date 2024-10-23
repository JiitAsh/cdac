import java.util.Scanner;
public class StringBuilderPractice{
	public static void main(String ...args){
		System.out.println("Hello Programmer :)");
		Scanner sc = new Scanner(System.in);
		
		/*
		// this will show error bcz sb not initialized
		StringBuilder sb;
		System.out.println(sb);
		*/
		
		
		/*
		// error: incompatible types
		StringBuilder sb = "Acts";
		System.out.println(sb);
		*/
		
		
		/*
		// correct
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		*/
		
		
		/*
		// error incompatible types
		StringBuilder sb = new StringBuilder();
		sb = "acts";    // error: incompatible types
		System.out.println(sb);
		*/
		
		
		/*
		// no error
		StringBuilder sb = new StringBuilder("Acts");
		System.out.println(sb);
		*/
		
		/*
		// error bcz nextLine() is for String
		StringBuilder sb = new StringBuilder();
		sb = sc.nextLine();
		System.out.println(sb);
		*/
		
		
		/*
		// correct way to take input for StringBuilder
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		*/
		
		
		/*   string builder methods
		StringBuilder sb = new StringBuilder("Acts");
		sb.insert(0,"Cd");
		System.out.println(sb);
		sb.insert(2,"ac");
		System.out.println(sb);
		sb.append("Pune");
		System.out.println(sb);
		
		sb.replace(0,3,"HELLO");
		System.out.println(sb);
		*/
		
		
		/* error bcz type mismatch
		StringBuilder sb = new StringBuilder("Acts");
		String str = "Acts";
		System.out.println(str.equlas(sb));  // incompatiblet types
		System.out.println(str==sb);  // incompatible types
		*/
		
		
		/*   capacity can increase if chars are more than capacity. StringBuilder does this automatically. for more go to docs or chatgpt :)
		StringBuilder sb = new StringBuilder(5);
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("Hello Jitesh");
		System.out.println(sb.capacity());
		System.out.println(sb);
		*/
		
		
		
		/*  all creates empty string/charSequence
		String s = new String();
		StringBuilder sb = new StringBuilder();
		StringBuffer sf = new StringBuffer();
		
		System.out.println("For string");
		System.out.println(s);
		System.out.println("For stringBuilder");
		System.out.println(sb);
		System.out.println("For stringBuffer");
		System.out.println(sf);
		*/
		
		
		System.out.println(sc.getClass());
		System.out.println(sc.getClass().getSuperclass());
		
		
		
		sc.close();
		
	}
}