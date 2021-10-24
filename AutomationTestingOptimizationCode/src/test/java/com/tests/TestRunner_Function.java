package com.tests;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestRunner_Function {  //Function and UnaryOperator
	
	private static Function<Integer, Integer> add5 = i->i+5;
	private static UnaryOperator<Integer> add5UsingUnary = i->i+5;
	private static Function<Integer, Integer> mult5 = i->i*5;
	private static Function<Integer, Integer> add5AndMult5 = i->(i+5)*5;
	private static Function<Integer, Integer> mult5AndAdd5 = i->(i*5)+5;
	private static Function<Integer, Integer> same = Function.identity();  //i->i
	private static Function<String, Integer> length = s->s.length(); //String::length;
	
	public static void main(String[] args) {
		System.out.println(add5.apply(5));
		System.out.println(mult5.apply(5));
		System.out.println(add5AndMult5.apply(5));
		System.out.println(mult5AndAdd5.apply(5));
		System.out.println();
		
		// output of first operation should match with input of second operation in chaning
		System.out.println(add5.andThen(mult5).apply(5));
		System.out.println(add5.compose(mult5).apply(5));
		System.out.println(same.apply(5));
		System.out.println();
		
		System.out.println(length.apply("Testing"));
		System.out.println(length.andThen(add5).apply("Testing"));
		System.out.println();
		
		System.out.println(add5UsingUnary.apply(5));
	}
}
