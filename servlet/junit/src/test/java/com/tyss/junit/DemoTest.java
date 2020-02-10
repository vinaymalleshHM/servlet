package com.tyss.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Its A Sample Test class")
class DemoTest {

	@DisplayName("To Test Add Method of Calculator")
	@Test
	void addTest() {
		Calculator cal = new Calculator();
		int i = cal.add(5, 6);
		assertEquals(11, i);
	}
	
	@DisplayName("To Test Add Method for Negative values ")
	@Test
	void addNegativeTest() {
		Calculator cal = new Calculator();
		int actual = cal.add(-10, -5);
		int expected = -15;
		assertEquals(expected, actual);
	}
	
	@Disabled
	@Test
	void subtraction() {
		
	}
	
	@Disabled
	@Test
	void division() {
		
	}

}
