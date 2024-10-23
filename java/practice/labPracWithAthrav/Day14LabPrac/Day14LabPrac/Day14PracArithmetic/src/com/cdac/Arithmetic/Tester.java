package com.cdac.Arithmetic;

public class Tester {

	public static void main(String[] args) {
		//Operations<Double> add=new Operation<Double>(); //Will show error as we cannot instantiate an interface
		Operations<Double> add=new AddOperation(); //AddOperation is a class that implements Operations interface //Upcasting
		ArithmeticOperation.arithOperation(1.5, 2.5, add);  //add.operate(1.5, 2.5)
	}

}
