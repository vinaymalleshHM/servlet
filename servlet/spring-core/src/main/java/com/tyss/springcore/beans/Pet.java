package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component // another way to configure for your class
public class Pet {
	public Pet() {}
	
	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
	
	private String name;
	@Autowired  // Default is byType we give here also @Autowired constructor,method and any where
//	@Qualifier("dog") // it is used to  serach Autowired = "byName"
	private Animal animal;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	

}
