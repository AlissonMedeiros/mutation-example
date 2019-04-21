package com.tdc.mutation.calculator.v1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorV1Test {

	@Test
	public void constructor() {
		new CalculatorV1();
	}

	@Test
	public void add() {
		Assertions.assertThat(CalculatorV1.add(1D, 2D)).isNotZero();
	}

	@Test
	public void divide() {
		Assertions.assertThat(CalculatorV1.divide(1D, 2D)).isNotNull();
	}

	@Test
	public void subtract() {
		Assertions.assertThat(CalculatorV1.subtract(100D, 2D)).isNotNegative();
	}

	@Test
	public void multiply() {
		Assertions.assertThat(CalculatorV1.multiply(1D, 2D)).isGreaterThan(1);
	}
}
