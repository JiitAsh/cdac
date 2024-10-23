import java.util.Scanner;
public class EnumTester{
	public static void main(String ...args){
		Scanner sc=new Scanner(System.in);
		/*
		Enum e1=Enum.FRIDAY;
		System.out.println(e1);
		String str=sc.nextLine();
		Enum e2=Enum.valueOf(str);
		System.out.println(e2);
		
		
		
		
		*/
		
		/*
		Enum e1=Enum.MONDAY;
		Enum e2=Enum.MONDAY;
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		
		The == operator checks if two references point to the same object in memory. Since enums are singletons (only one instance of each constant exists), e1 == e2 will return true because both e1 and e2 reference the same Enum.MONDAY instance.
		*/
		
		/*
		Enum e1 = Enum.MD;
		System.out.println(e1.name());
		System.out.println(e1.ordinal());
		System.out.println(e1.getVal());
		System.out.println(e1);
		*/
		
		
		
		/*
		
		System.out.println("sjdkdj" + false);
		System.out.println("sjdkdj" + false);
		
		The expression "sjdkdj" + false involves a string ("sjdkdj") and a boolean (false).
		In Java, when you use the + operator with a string and another type (like a boolean), it performs string concatenation. The boolean value is converted to its string representation ("false"), and the result is "sjdkdjfalse".
		
		
		
		
		
		
		System.out.println(true + true);
		System.out.println(false + true);
		System.out.println(false + false);
		
		Here, the expressions involve boolean values being added together.
		In Java, the + operator is not defined for boolean types in the same way it is for numbers or strings. Instead, you typically use logical operators like && (AND) or || (OR) for boolean values.
		As a result, the code tries to interpret the + operator on booleans, which is not valid 	in Java, and will cause a compilation error.


	    */
	}
	
}