import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray{
	public static void main(String[] args){
		System.out.println("Hello Programmer :)");
		
		
		// 1. correct no error
		//double[][] farr = null;
		
		//System.out.println(Arrays.toString(farr));
		
		// 2. error null pointer exception
		//double[][] farr = null;
		
		//System.out.println(Arrays.toString( farr));
		//System.out.println(Arrays.toString(farr[0]));  here error will occur NullPointerException
		
		// 3. 
		double farr[][] = null;
		farr[2][] = {{2.4,3.4},{3.0,4.0,5.6}};
		
		System.out.println(Arrays.toString(farr));
		System.out.println(Arrays.toString(farr[0]));
		System.out.println(Arrays.toString(farr[1]));
		
		System.out.println(farr);
		System.out.println(farr[0]);
		System.out.println(farr[1]);
	
	}
}