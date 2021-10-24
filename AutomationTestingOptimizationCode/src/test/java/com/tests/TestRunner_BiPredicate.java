package com.tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import org.testng.annotations.Test;

public class TestRunner_BiPredicate {  
	
	BiPredicate<String, String> isLengthMatching = (a,b)->a.length()==b.length();
	BiPredicate<Integer, Integer> isSumDivBy10 = (a,b)->(a+b)%10==0;
	
	@Test
	public void predicateTest(){
		System.out.println("isLengthMatching.test() = "+isLengthMatching.test("Sky", "Fly"));
		System.out.println("isSumDivBy10.test() = "+isSumDivBy10.test(3, 7));
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		sum(numbers);
	}

	private void sum(List<Integer> numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);   
		}
		System.out.println("sum = "+sum);
	}
}
