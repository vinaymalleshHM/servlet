package com.tyss.jdbcapp.common;

@SuppressWarnings("serial")
public class TestA  extends RuntimeException{
	public static void main(String[] args) {
		System.out.println("hello");
		@SuppressWarnings("unused")
		int a=6/6;
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			try {

			}catch(ArithmeticException e) {
				try {

				}
				catch(Exception y) {
				}

			}
		}
		catch(Exception e) {
		}
		finally {

		}
	}
}
