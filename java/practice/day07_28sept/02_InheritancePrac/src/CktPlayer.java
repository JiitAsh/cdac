
public class CktPlayer extends Player {
	private int runs;
	
	public CktPlayer() {
		//super();   // it's not compulsory bcz if don't use still by default parent class default ctor will be called
		
		//this();    // will show error: recursive method call bcz this() calls default ctor of current class.
		System.out.println("CktPlayer default ctor !!");
		runs = 0;
	}
	
	
	// it will only initialize the CktPlayer data members. parent class (Player) data members will be initialize with default ctor (with default values)
//	public CktPlayer(int runs) {
//		System.out.println("CktPlayer param ctor !!");
//		this.runs = runs;
//	}
	
	
	// it will also call parent class param ctor
	public CktPlayer(String name, int age, int runs) {
		//super();   // if we don't pass arguments then default ctor of parent will be invoked.
		super(name, age);   // so pass arguments so that correct values can initialize
		
		//this();
		System.out.println("CktPlayer param ctor !!");
		this.runs = runs;
	}
	
	//@Override
//	public String get() {
//		System.out.println("CktPlayer class get() method");
//		//return super.get() + ", runs: " + runs; 
//		return ", runs: " + runs;
//	}
	
	public String getCktPlayerDetails() {
		System.out.println("CktPlayer class get() method");
		//return super.get() + ", runs: " + runs; 
		return get() + ", runs: " + runs;
	}
	
//	@Override
//	public String getWrongDetails() {
//		System.out.println("CktPlayer class getWrong() method");
//		return ",runs: " + runs;
//			
//	}
}
