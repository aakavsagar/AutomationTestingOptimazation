package com.tests;

import java.util.function.Predicate;

import org.testng.annotations.Test;

public class TestRunner_Predicate {  
	
	Predicate<Integer> isEven = (i)->i%2==0;
	//Predicate<Integer> isOdd = (i)->i%2==1;
	Predicate<Integer> isOdd = isEven.negate();
	
	Predicate<Integer> isDivBy3 = i->i%3==0;
	Predicate<Integer> isDivBy6 = isEven.and(isDivBy3);
	
	Predicate<String> isSWA = s->s.startsWith("a");
	Predicate<String> isSWB = s->s.startsWith("b");
	Predicate<String> isSWAorSWB = isSWA.or(isSWB);
	
	
	@Test
	public void predicateTest(){
		
		System.out.println("isEven.test() = "+isEven.test(2));
		System.out.println("isOdd.test() = "+isOdd.test(9));
		//System.out.println("isEven.test() = "+isEven.negate().test(2));
		
		System.out.println("isDivBy6.test() = "+isDivBy6.test(12));
		System.out.println();
		
		System.out.println("isSWAorSWB.test() = "+isSWAorSWB.test("amuthan"));
		
	}
}
