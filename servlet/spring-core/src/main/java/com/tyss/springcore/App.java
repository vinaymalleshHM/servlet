package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

import lombok.extern.java.Log;
@Log
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    	Hello hello = context.getBean(Hello.class); //factory method privided by spring only
//    	System.out.println(hello.getMessage());
    	System.out.println("-----------------------------");
    	Hello hello1 = context.getBean(Hello.class); // it will create only one object and we can use functionality multiple 
//    	System.out.println(hello1.getMessage());
    	System.out.println(hello1.getMap().toString());
    	
    	System.out.println("-----------------------------");
    	Hello hello2 = context.getBean(Hello.class); // it will create only one object and we can use functionality multiple 
//    	System.out.println(hello2.getMessage());
    	System.out.println(hello1==hello2);
    	System.out.println(hello2.getList());// no need to use toString() method
    	
    	
    	System.out.println("-----------------------------");
//    	context.getBean(Animal.class).makeSound();
    	Animal animal = context.getBean(Animal.class);// here we are using dog object this is what called dependency
    	animal.makeSound();
//    	Animal animalCat =(Animal) context.getBean("dog");// here we have now 2 object so to do that we can pass id of bean then we need to down cast
//    	animalCat.makeSound();
    	
    	System.out.println("-----------------------------");
    	Pet pet = context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
//    	context.close(); // error bcz we don't have this method in ApplicationContext change to ClassPathXmlApplicationContext
    	context.close();
    }
}
