package com.cdac.Arithmetic;

public class AddOperation implements Operations<Double> {

	@Override
	public Double operate(Double a, Double b) {
		return a + b;
	}

}
