package com.sapient.shapes;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {

	private BigDecimal result;

	public BigDecimal calculateArea(int radius) {
		result = new BigDecimal(3.14).multiply((new BigDecimal(radius)).multiply(new BigDecimal(radius)));
		result = result.setScale(4, RoundingMode.CEILING);
		return result;
	}
}