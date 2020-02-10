package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Dog;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.BeansConfog;

public class AnnotaionConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(BeansConfog.class);
//		Hello hello = context.getBean(Hello.class);
//		System.out.println(hello.getMessage());
		Hello hello1 = context.getBean(Hello.class);
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello1==hello2);
		
		System.out.println("***************");
		
//		Animal animal = context.getBean(Animal.class);  // dog object
//		animal.makeSound();
	
		Animal animal = context.getBean(Animal.class);// here primary annotation using
		animal.makeSound();
		System.out.println("*************");
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		System.out.println("****************");
		
		Dog dog = context.getBean(Dog.class); 
		System.out.println(Boolean.toString(dog==pet.getAnimal())); // here we comparing with dog and pet.getAnimal() to check whether it is returning same object are not
		
		
		context.close();
		
	}

}
