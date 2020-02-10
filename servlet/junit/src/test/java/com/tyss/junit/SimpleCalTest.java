package com.tyss.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import javax.annotation.PreDestroy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SimpleCalTest {
	@ParameterizedTest
	@MethodSource("getDivValue")
	void getDivResult(int a,int b,int c) {
		SimpleCal cal = new SimpleCal();

		//		int result =  cal.div(a, b);
		//		assertEquals(c, result); // throws exception


		//		assertThrows(ArithmeticException.class, ()->{
		//			cal.div(a, b);
		//		});
		if (c==0) {

			assertThrows(ArithmeticException.class, ()->{
				cal.div(a, b);
			});
		} else {
			int result =  cal.div(a, b);
			assertEquals(c, result);
		}

	}

	static Stream<Arguments> getDivValue(){
		return Stream.of(
				Arguments.arguments(10,5,2),
				Arguments.arguments(60,-6,-10),
				Arguments.arguments(20,0,0)

				);

	}
}
