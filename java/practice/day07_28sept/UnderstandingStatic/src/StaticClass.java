
public class StaticClass {
	int val = 3;
	// static integer with value
	static int a = 3;   
	
	// static b which value will be calculated in static block
	static int b;    
	
	// static method accessing static variables
	static void meth(int x) {
		System.out.println("x: " + x);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
		
	// static block when class will be loaded first time this block will execute and will set the value of 'b'
	static {
		System.out.println("Inside static block!!");
		b = a*4;
	}
	
	
}