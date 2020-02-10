package com.tyss.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BMICalculatorTest {

	@ParameterizedTest
	@MethodSource("getBmiValue")
	void getBmiResultTest(double value,String result) {
		BMICalculator bmi = new BMICalculator();
		String actual = bmi.getBmiResult(value);
		assertEquals(result, actual);
	}

	static Stream< Arguments> getBmiValue(){
		return Stream.of(
				Arguments.arguments(18.9,"Normal"),
				Arguments.arguments(15.9,"Under weight"),
				Arguments.arguments(26.9,"Over weight"),
				Arguments.arguments(23.9,"Normal"),
				Arguments.arguments(54.9,"Obesity"),
				Arguments.arguments(16.2,"Under weight")
				);

	}

}
