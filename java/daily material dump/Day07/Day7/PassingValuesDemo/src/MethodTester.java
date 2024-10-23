
public class MethodTester {
	
	private int var;
	
	public MethodTester(int var) {
		super();
		this.var = var;
	}
	
	

	public int getVar() {
		return var;
	}



	public void setVar(int var) {
		this.var = var;
	}



	public static int add( int a, int b) {
		a = 100;
		b = 100;
		return a+ b;
	}
	
	public static void changeObject( MethodTester tester) {
		tester.setVar(50000);
	}
	
	public static void main(String[] args) {
		int p = 10;
		int q = 20;
		add(p, q);
		System.out.println(p);
		System.out.println(q);
		
		MethodTester tester = new MethodTester(20);
		MethodTester.changeObject(tester);
		System.out.println(tester.getVar());
		
	}

}
