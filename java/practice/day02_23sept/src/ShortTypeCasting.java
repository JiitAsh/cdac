public class ShortTypeCasting{
	public static void main(String[] args){
		System.out.println("Hello Java :)");
		// similar opes like byte
		/*
		byte b=20;
		byte c=30;
		short s = 140;
		s=b+c;
		System.out.println(s);
		*/
		
		long l=20;
		long i=10;
		System.out.println(i);
		
		//i=10+l;   lossy conversion due to l bcz it's long
		i=10+(int)l;
		System.out.println(i);
		
		
		
		
		//byte b=40+20;
		
		
		// these are wrong
		//b=byte(60 + b);  here sytax is wrong
		//b=(byte)60 + b;  lossy conversion
		//b=(byte)60+(byte)b;  lossy conversion
		
		// these are correct
		//b=(byte)(60+b);
		//b=(byte)((byte)60+b);
		//b=(byte)(60+(byte)b);
		
		// it's wrong bcz wrong syntax
		//b=(byte)(byte(60+b));
		
		//System.out.println(b);
	}
}