package com.tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class PredicateTest {
	// sum(numbers);
	// sumOfOddNumbers(numbers);
	// sumOfEvenNumbers
	// sumOfNumbersDivisibleBy3
	
	@Test
	public void predicateTest() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		sumUsingJava8(numbers, i->i%2!=0); // sumOfOddNumbers
		sumUsingJava8(numbers, i->true);  // sumOfAllNumbers
		sumUsingJava8(numbers, i->i%2==0);
		sumUsingJava8(numbers, i->i%3==0);
	}

	private void sumUsingJava8(List<Integer> numbers, Predicate<Integer> predicate) {
		System.out.println(numbers.stream()
				.filter(predicate)
				.mapToInt(Integer::intValue)
				.sum());
	}
	
	
	
	/*private void sumOfOddNumbers(List<Integer> numbers) {
		int sum = 0;
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)%2!=0) {
				sum = sum+numbers.get(i);
			}
			System.out.println("sum = "+sum);
		}
	}
	private void sumOfEvenNumbers(List<Integer> numbers) {
		int sum = 0;
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)%2==0) {
				sum = sum+numbers.get(i);
			}
			System.out.println("sum = "+sum);
		}
	}
	private void sumOfNumbersDivisibleBy3(List<Integer> numbers) {
		int sum = 0;
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)%3==0) {
				sum = sum+numbers.get(i);
			}
			System.out.println("sum = "+sum);
		}
	}
	
	private void sum(List<Integer> numbers) {
		int sum = 0;
		for(int i=0;i<numbers.size();i++) {
			sum = sum+numbers.get(i);
		}
		System.out.println("sum = "+sum);
	}*/
}
