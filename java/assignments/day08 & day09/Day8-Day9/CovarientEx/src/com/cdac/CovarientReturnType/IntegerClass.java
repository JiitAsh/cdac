package com.cdac.CovarientReturnType;
import com.cdac.CovarientReturnType.*;
public class IntegerClass extends NumberClass{
	public IntegerClass() {}
	@Override
	public  Integer addNumber(Number a, Number b) {
	    int i1 = a.intValue(); 
        int i2 = b.intValue(); 
		return  i1 + i2;
	}
	

}
