package com.tests;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;

public class TestRunner_BiFunction {  
	
	private static BiFunction<Integer, Integer, Integer> sum = (a,b)->a+b;
	private static BinaryOperator<Integer> sumUsingBinaryOperator = (a,b)->a+b;
	private static DoubleFunction<String> doubleToString = d->String.valueOf(d);
	
	public static void main(String[] args) {
		
		System.out.println(sum.apply(6, 5));
		System.out.println(sumUsingBinaryOperator.apply(6, 5));
	}
}
