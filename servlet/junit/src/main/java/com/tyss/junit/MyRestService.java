package com.tyss.junit;

public class MyRestService {
	
	public String getStudentName() {
		return "prince";
	}
	

	public String getTeacherName() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		return "test";
		
	}
}
