package com.tyss.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class MyRestServiceTest {

	@Test
	@Timeout(value=1000,unit = TimeUnit.MILLISECONDS)
	void test() {
		MyRestService m = new MyRestService();
		String name = m.getStudentName();
		assertNotNull(name);
	}

	@Test
	@Timeout(value=5000,unit = TimeUnit.MILLISECONDS)
	void getTeacherNameTest() {
		MyRestService m = new MyRestService();
		String name = m.getTeacherName();
		assertNotNull(name);
	}
}
