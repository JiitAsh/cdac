package EnumWithCtorMethod;

public enum TitleEnum {
	SE("Software Eng"),
	HR("HR Executive"),
	MD("Managing Director");
	
	
	private String description;
	private TitleEnum(String roleName) {
		description = roleName;
	}
	
	public String getDescription() {
		return description;   // will return description of roleName, won't return the role name
	}
}
