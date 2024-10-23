public class PracticeString{
	public static void main(String ...args){
		/*
		String s1="CDAC";
		String s2="ACTS";
		String s3="ACTS";
		String s4=new String("ACTS");
		if(s2==s3){
		System.out.println("s2 and s3 are same");
		
		}
		
		if(s3==s4){
		System.out.println("s3 and s4 are same");
			
		}
		System.out.println("s2.equals(s3)" + s2.equals(s3));
		System.out.println("s2.equals(s4)" + s2.equals(s4));
		
		s4.intern();
		if(s3==s4){
		System.out.println("s3 and s4 are same");
			
		}
		*/
		
		
		
		
		/*String s1="CDAC ACTS";
		System.out.println(s1.charAt(15));*/
		/*String s1="           Cdac    acts          ";
		//String s1=String.valueOf(val, 2, 2);*/
		
		/*
		String s1="CDAC";
		String s2="CDAC";
		s1=s1.concat("acts");
		
		//s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		
		
		//StringBuilder sc1="ABCDEFGHIJK";  //Not allowed as string cannot be converted to StringBuilder
		/*
		StringBuilder sc2=new StringBuilder("lmnopqrst");
		StringBuilder sc3=new StringBuilder();
		sc3.append("acts");
		//System.out.println(sc1);
		System.out.println(sc2); 
		sc2.append(sc3);
		System.out.println(sc2);
		System.out.println(sc3);
		*/
		
		
		/*
		String s="I like paisaaaaaa";
		System.out.println(s.contains("like"));
		System.out.println(s.contains("paisa"));
		System.out.println(s.contains("Java"));
		*/
		
		
		
		StringBuilder num = new StringBuilder("Actsskfdjkff");
		num.replace(0,0,"Java");
		System.out.println(num);
		
	}
}