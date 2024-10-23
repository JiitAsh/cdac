package day6;

public enum CourseEnum {
	DAC("Diploma in Advance Computing"),
	DESD("Diploma in Embeded Sys Design"),
	DVLSI("Diploma in VLSI") ;
	
	private String str ;
	CourseEnum(String str) {
		this.str = str ;
	}
	
	public String getValue() {
		return str ;
	}

}
