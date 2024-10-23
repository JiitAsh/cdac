
public class Base {
	public Number method1() {
		System.out.println(100);
		return 100;
	}
	
	public void method1(Number number) {
		System.out.println(number + " From base");
	}
	
	protected long m(int num) {
		return num;
	}
}
