/*C:\Users\dac.STUDENTSDC\Desktop\Batch-1_Java\Day6\DatePrac>java DateTester
Fri Sep 27 16:02:23 IST 2024
27/09/2024
25/09/2024
Wed Sep 25 00:00:00 IST 2024

C:\Users\dac.STUDENTSDC\Desktop\Batch-1_Java\Day6\DatePrac>java DateTester
Fri Sep 27 16:02:44 IST 2024
27/09/2024
23/23/2024     //23%12==11 will be added in months and 23/12==1 will be added in year 2024
Sun Nov 23 00:00:00 IST 2025

C:\Users\dac.STUDENTSDC\Desktop\Batch-1_Java\Day6\DatePrac>java DateTester
Fri Sep 27 16:03:30 IST 2024
27/09/2024
27/107/2024
Sat Nov 27 00:00:00 IST 2032

C:\Users\dac.STUDENTSDC\Desktop\Batch-1_Java\Day6\DatePrac>java DateTester
Fri Sep 27 16:05:04 IST 2024
27/09/2024
35/09/2024  
Sat Oct 05 00:00:00 IST 2024

C:\Users\dac.STUDENTSDC\Desktop\Batch-1_Java\Day6\DatePrac>java DateTester
Fri Sep 27 16:06:07 IST 2024
27/09/2024
65/09/2024
Mon Nov 04 00:00:00 IST 2024

*/        

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTester{
	/*
	private static String dateFormatter(Date fullDate){
		if(null==fullDate){
			return null;
		}
		
	
		//SimpleDateFormat sdf = new SimpleDateFormat();    //  27/09/24, 4:45 PM  if not provide dd/MM/yyyy format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  //  27/09/24
		String formattedDate = sdf.format(fullDate);
		return formattedDate;
	} 
	*/
	
	
	
	
	private static Date fullDateConverter(String strDate) throws ParseException{
	
		if(null==strDate || strDate.equals("")){
			return null;
		}
		
		//SimpleDateFormat sdf = new SimpleDateFormat();    // will throw error bcz we have to pass the format dd/MM/yyyy 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(strDate);
	
	}
	
	
	public static void main(String ...args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		// without function
		/*
		Date d1=new Date();
		System.out.println(d1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d1));
		
		String str = sc.nextLine();
		//Date d2 = sdf.parse("23/09/2024");    // will throw parseException
		Date d2 = sdf.parse(str);    // will throw parseExp 
		System.out.println(d2);   
		*/
		
		
		
		/*
		// with funtion to change  Sun Nov 23 00:00:00 IST 2025 to 23/11/2025
		Date todaysDate = new Date();
		String res = dateFormatter(todaysDate);
		System.out.println(res);
		*/
		
		
		
		// with function to change   23/11/2025   to  Sun Nov 23 00:00:00 IST 2025
		System.out.print("Enter data in dd/MM/yyyy format : ");
		String strDate = sc.nextLine();
		System.out.println(fullDateConverter(strDate));
		
		sc.close();
	}


}