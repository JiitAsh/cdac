
public class StaticTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// directly access of static method using class name without creating an object
		StaticClass.meth(24);  
		
		// directly access of static variable using class name without creating an object
		System.out.println("The value of a is: " + StaticClass.a);  
		
		
		
		
		// checking class names
		StaticClass sc = new StaticClass();
		
		System.out.println(sc instanceof StaticClass);   // checks that sc is a instance of StaticClass or not
		System.out.println(sc.getClass());   // class name
		System.out.println(sc.getClass().getName());   // classname
		System.out.println(StaticClass.class);   // classname
	}

}





