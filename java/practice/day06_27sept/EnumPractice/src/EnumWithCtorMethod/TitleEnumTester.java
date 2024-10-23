package EnumWithCtorMethod;

public class TitleEnumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TitleClass tc1 = new TitleClass();
		
		
		TitleEnum te1 = TitleEnum.HR;
		System.err.println(te1.getDescription());
		
		TitleEnum te2 = TitleEnum.SE;
		System.err.println(te2.getDescription());
		
		SalaryEnum se1 = SalaryEnum.SE;
		System.out.println(se1.getSalary());
		
		SalaryEnum se2 = SalaryEnum.MD;
		System.out.println(se2.getSalary());
	}

}
