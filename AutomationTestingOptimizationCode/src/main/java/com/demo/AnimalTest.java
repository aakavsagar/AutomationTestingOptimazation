package com.demo;

import java.util.function.Consumer;

public class AnimalTest {

	private static void perform(Animal animal) {
		animal.run();
	}
	
	public static void main(String[] args) {
		perform(new Dog());
		
		perform(()->System.out.println("Running at 100kmph"));
		
		toUpper("Amuthan");
		toLower("AMUTHAN");
		stringOperation(String::toUpperCase,"amuthan");
		stringOperation(String::toLowerCase,"AMUTHAN");
	}
	
	private static void stringOperation(Consumer<String> consumer, String temp) {
		consumer.accept(temp);
	}
	
	private static void toLower(String string) {
		System.out.println(string.toUpperCase());
	}

	private static void toUpper(String string) {
		System.out.println(string.toLowerCase());
	}
	
	

}
