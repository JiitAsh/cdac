
public class Derived extends Base {
	@Override
	public Integer method1() {    // child data type 
		System.out.println(200);
		return 200;
	}
	
	@Override
	public void method1(Number number) {
		System.out.println(number + " from derived");
	}
	
	
	
 //  visibility narrowing/ reducing is not allowed
//	@Override
//	private long m(int num) {
//		return num-1;
//	}
	
	
	
	// widening is allowed 
	@Override
	public long m(int num) {
		System.out.println(num-1);
		return num-1;
	}

}