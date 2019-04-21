package com.tdc.mutation.calculator.v2;

import com.tdc.mutation.calculator.v1.CalculatorV1;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorV2Test {

	@Test
	public void add() {
		Assertions.assertThat(CalculatorV2.add(1D, 2D))
			.isNotNull()
			.isPositive()
			.isNotZero()
			.isEqualTo(3D);
	}

	@Test
	public void divide() {
		Assertions.assertThat(CalculatorV2.divide(50D, 5D))
			.isNotNull()
			.isPositive()
			.isNotZero()
			.isEqualTo(10D);
	}

	@Test
	public void subtract() {
		Assertions.assertThat(CalculatorV2.subtract(25D, 5D))
			.isNotNull()
			.isPositive()
			.isNotZero()
			.isEqualTo(20D);
	}

	@Test
	public void multiply() {
		Assertions.assertThat(CalculatorV2.multiply(25.5, 5D))
			.isNotNull()
			.isPositive()
			.isNotZero()
			.isEqualTo(127.5);
	}
}
