package com.cdac.Arithmetic;

public class ArithmeticOperation {
	public static Double arithOperation(Double a, Double b, Operations<Double> op) {
		return op.operate(a, b);
	}
}
