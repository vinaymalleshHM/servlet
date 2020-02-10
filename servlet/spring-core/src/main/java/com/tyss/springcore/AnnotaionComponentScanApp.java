package com.tyss.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.SpringConfig;

public class AnnotaionComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		
	}

}
