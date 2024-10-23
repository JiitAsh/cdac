package EnumWithCtorMethod;

public enum SalaryEnum {
	SE(150000),
	HR(75000),
	MD(175000);
	
	private int salary;
	private SalaryEnum(int roleName) {
		salary = roleName;
	}
	
	public int getSalary() {
		return salary;
	}
	
}
