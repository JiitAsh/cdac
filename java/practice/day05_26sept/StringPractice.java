//import java.lang.String;
public class StringPractice{
	public static void main(String[] args){
		System.out.println("Hello Programmer :)");
		// String str;
		// System.out.println(str);   // error: str not initialized
		
		
		// String str;
		// str = "Acts";
		// System.out.println(str);  // no error   o/p-> Acts
		
		// String str = "Acts";
		// System.out.println(str);  // no error o/p-> Acts
		
		
		//String str=new String("Acts");
		//System.out.println(str);  // no error o/p-> Acts
		
		
		//String str=new String();
		//str = "Acts";
		//System.out.println(str);  // no error o/p-> Acts
		
		
		
		
		/*
		String s1="cdac";
		String s2="acts";
		String s3="acts";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		s1=s1+"Acts";  // now s1 will hold a new value an "cdac" will place as it is in literal pool
		System.out.println(System.identityHashCode(s1));   // here now s1's address will change 
		*/
		
		
		
		
		/*
		String s1="cdac";
		String s2="acts";
		String s3="acts";
		String s4 = new String("acts");
		
		if(s1==s2){
			System.out.println("s1 s2 are same");
		}
		
		if(s1.equals(s2)){
			System.out.println("s1 s2 are  equal");
		}
		
		if(s3==s2){
			System.out.println("s2 s3 are same");
		}
		
		if(s2.equals(s3)){
			System.out.println("s2 s3 are equal");
		}
		
		if(s3==s4){
			System.out.println("s3 s4 are same");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 s4 are equal");
		}
		*/
		
		
		/*
		String s1="cdac";
		String s2="acts";
		String s3="acts";
		String s4 = new String("acts");
		
		if(s3==s4){
			System.out.println("s3 s4 are same");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 s4 are equal");
		}
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
		s4=s4.intern(); // now s4 and s3 will be equal
		if(s3==s4){
			System.out.println("s3 s4 are same");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 s4 are equal");
		}
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
		// now create a new stirng with anothe name.
		String s5=new String("Pune");  // pune is not in string literal pool, so if we try to push it in pool then new entry/value will be created
		System.out.println(System.identityHashCode(s5));  // here is the reference of "Pune" from outside pool
		
		s5=s5.intern();
		System.out.println(System.identityHashCode(s5));  // here is the reference of "Pune" from inside pool
		*/
		
		
		/*
		// valueOf examples with different data types
		int i = 1234;
		String str = new String();
		str = String.valueOf(i);   // from int to string
		System.out.println(str);
		
		int ii = Integer.valueOf(str); // int to string
		System.out.println(ii);
		
		
		double dd = Double.valueOf(ii); // int to double
		System.out.println(dd);
		*/
		
		
		
		/*    equals() and equalsIgnoreCase() examples
		String s1 = "ACTS";
		String s2 = "ACTS";
		String s3 = "ACts";
		String s4 = "acts";
		
		if(s1.equals(s2)){
			System.out.println("Equal");
		}
		if(s1.equalsIgnoreCase(s3)){
			System.out.println("Equal");
		}
		if(s1.equalsIgnoreCase(s4)){
			System.out.println("Equal");
		}
		*/
		
		
		/*  
		String str; 
		System.out.println(str);   // will show an error that Str not initialized
		
		// but here empty string will be assigned
		String str = new String();
		System.out.println(str);  // output will be ""
		*/
		
		
		
		/*   data type of both values/objects in equals() method must be same
		float f = 12.30f;
		double d = 12.30;
		if(d.equals(f)){
			System.out.println("Equal");
		}
		*/
		
		
		/*
		// string concatination with '+' oprator and with concat() method
		String s1 = "cdac";
		String s2 = "cdacacts";
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = s1 + "acts";
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1==s2){
			System.out.println("s1 s2 are same");
		}
		if(s1.equals(s2)){
			System.out.println("s1 s2 are equal");
		}
		
		s1 = s1.intern();
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1==s2){
			System.out.println("s1 s2 are same");
		}
		if(s1.equals(s2)){
			System.out.println("s1 s2 are equal");
		}
		*/


		/*  concat()--> same as '+' oprator
		String s3 = "pune";
		String s4 = "punecity";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
		
		s3 = s3.concat("city");  // same as + operator
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
		if(s3==s4){
			System.out.println("s3 s4 are same");
		}
		if(s3.equals(s4)){
			System.out.println("s3 s4 are equal");
		}
		*/
		
		
		
		/*  charAt(), toLowerCase(), toUpperCase() etc
		String s1 = "Cdac";
		System.out.println(s1.charAt(2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		*/
		

		//contains()  checks char sequence not word
		/*
		String str = "I hate Java";
		System.out.println(str.contains("hate"));
		System.out.println(str.contains("hat"));
		*/
		
		
		/*
		// trim() only removes leading and trailing spaces
		String str = "      Hello     Bhai       ";
		System.out.println(str);
		System.out.println(str.trim());
		*/
		
		
		
		
		/*  // compareTo()--> compares every charater's ASCII value and if ASCII value is bigger then +ve, if lesser then -ve otherwise 0
		String s1 = "acts";
		String s2 = "acts";
		String s3 = "actt";
		String s4 = "bcts";
		
		if(s1.compareTo(s2)==0){
			System.out.println("s1 are equal s2");
		}
		if(s1.compareTo(s3)>0){
			System.out.println("s1 is bigger than s3");
		}
		if(s1.compareTo(s3)<0){
			System.out.println("s1 is lesser than s3");
		}
		*/
		
		
		
		
		
		
		
		
		
	}
}