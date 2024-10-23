public class ByteTypeCasting{
	public static void main(String[] args){
		System.out.println("Hello Java :)");
		byte b=40;
		
		//byte b=40+20;  it's correct
		//byte b=40+100;  it's wrong
		//byte b = 140;  it's wrong bcz out of range lossy conversion
		
		
		// these are wrong
		//b=byte(60 + b);  here sytax is wrong
		//b=(byte)60 + b;  lossy conversion
		//b=(byte)60+(byte)b;  lossy conversion
		
		// these are correct
		b=(byte)(60+b);
		//b=(byte)((byte)60+b);
		//b=(byte)(60+(byte)b);
		
		// it's wrong bcz wrong syntax
		//b=(byte)(byte(60+b));
		
		System.out.println(b);
	}
}