package com.tyss.springcore.beans;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;

public class A {

	public Pet m1()  {
	
		Pet pet = new Pet("prince",new Dog());
		return  pet;
		
	}

}
