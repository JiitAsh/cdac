package com.cdac;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



//     exception tester one
public class ExcMain {
	

	private static final Exception ParseException = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Date d=new Date();
		// tcf ---> try catch finally
		//SimpleDateFormat sd=new SimpleDateFormat();         // 1.
		//SimpleDateFormat sd=new SimpleDateFormat("jdkfdfdk"); //  2. won't go in any of the block not even in try
		//SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");   // 3. no error
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");     // 4. 
		
		
		try {
			System.out.println("Try excuted!! before");
			//SimpleDateFormat sd=new SimpleDateFormat("gfgh");     //"gfgh" and "201254" will give differ output even if both are string literals 
			//SimpleDateFormat sd=new SimpleDateFormat("201254");
			d=sd.parse("02/01/2024");
			System.out.println("Try excuted!!");
		}
		catch (ParseException pe) {
			System.out.println("Catch excuted before printStack");
			//pe.printStackTrace();
			throw pe;
			//System.out.println("Catch excuted !!");
			//return;
			
		}
		finally {
			
			System.out.println("Finally excuted!!");
			//return ;
		}
	}

}
