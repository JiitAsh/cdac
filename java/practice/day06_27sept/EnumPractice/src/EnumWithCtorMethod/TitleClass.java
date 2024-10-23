package EnumWithCtorMethod;

public class TitleClass {
//	SE("Software Eng"),
//	HR("HR Executive"),
//	MD("Managing Director");
//	
	private String roleName;
	
	public TitleClass() {
		this.roleName = "HR";
	}
	
	private TitleClass(String roleName) {
		this.roleName = roleName;
	}
	
	public String getValue() {
		return roleName;   // will return description of roleName, won't return the role name
	}
}
