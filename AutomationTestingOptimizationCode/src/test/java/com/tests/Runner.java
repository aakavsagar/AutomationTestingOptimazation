package com.tests;

import java.util.function.Function;


public class Runner {
	
	public static void main(String[] args) {
		
		/*Consumer<String> obj1 = s->System.out.println(s.toUpperCase());
		Consumer<Integer> obj2 = i->System.out.println(i);
		
		obj1.accept("Java");
		obj2.accept(10);*/
		
		/*Supplier<String> sayHello = ()->"Hello";
		
		System.out.println(sayHello.get());*/
		
		/*Predicate<String> isEmptyString = s->s.length()==0;
		System.out.println(isEmptyString.test("boolean"));*/
		
		Function<String, Integer>  length = s->s.length();
		System.out.println(length.apply("Hello Babe"));
		
		Function<String, String>  str = String::toUpperCase;
		System.out.println(str.apply("Hello Babe"));
		
	}
}

/*
//Conventional way           Before java 1.8
		Printable obj = new ConsoleImpl();
		obj.print();
		
		//Anonymous inner class
		Printable obj1 = new Printable() {
			
			@Override
			public void print() {
				System.out.println("I am from anonymous inner class");
			}
		};
		
		
		//1. parameters to method should match.
		//2. Return type method should match.
		//3. Interface needs to have only one abstract method.
		
		Printable obj2 = ()->System.out.println("I am from Lambda expression");
		
		obj1.print();
		obj2.print();*/