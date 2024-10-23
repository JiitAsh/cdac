package DatePrac;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DatePrac {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String md = sdf.format(today);
		System.out.println(md);
		
		
		Date tomorrow = sdf.parse("30/09/2024");
		System.out.println(tomorrow);
	}

}
