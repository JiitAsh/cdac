public class DeadAndUnreachable{
	public static void main(String[] args){
		// 1. No error
		
		while(true){
			System.out.println("Inside loop");
		}
		
		
		
		// 2. Error: Unreachable Statement 
		/*
		while(true){
			System.out.println("Inside loop");
		}
		System.out.println("Outside loop");  (error for this statement/line)
		*/
		
		// 3. No Error, else will never execute but still no unreachabel error bcz if-else executes only once
		/*
		if(true){
			System.out.println("Inside");
		}else{
			System.out.println("Outside");
		}
		*/
		
		
		// 4. Still No Error
		/*
		while(true){
			if(true){
			System.out.println("Inside");
		}else{
			System.out.println("Outside");
		}
		}
		*/
		
		// 5. No error but it's a dead code waste of memory/resource
		/*
		int a=20;
		a=a;
		*/
		
		// 6. Not a Statement Error
		/*
		int a=10;
		a+a;
		*/
		
		
	}
}