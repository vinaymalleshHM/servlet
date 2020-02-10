package com.tyss.springcore.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component // it's generic
// @Service //same functionality will do
// @Repository //same functionality will do
public class Dog implements Animal{

	public void makeSound() {
		System.out.println("Baaooooooooooooooo");
		
	}

}
