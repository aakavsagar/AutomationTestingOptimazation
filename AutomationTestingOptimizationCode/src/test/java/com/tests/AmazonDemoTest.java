package com.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemoTest {
	/*
	 1. Fetch all the link text from the amazon home page
	 2. Ignore the duplicates and empty string
	 3. Sort in alphabetical order
	 4. Print Only the text starting with A and B
	 
	 */
	
	@Test
	public void demoTest() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
		//printUsingOldWay(elements);
		printUsingJava8Way(elements, s->s.startsWith("A") || s.startsWith("C"));
	}

	private void printUsingJava8Way(List<WebElement> elements , Predicate<String> predicate) {
		elements.stream()
				.parallel()
				.map(WebElement::getText)
				.distinct()
				.sorted()
				.filter(s->s.length()>0)
				.filter(predicate)
				.forEach(System.out::println);
	}

	private void printUsingOldWay(List<WebElement> elements) {
		Set<String> set = new HashSet<>();
		for (WebElement element : elements) {
			String temp = element.getText();
			if(temp.length()>0) {
				set.add(temp);
			}
		}
		List<String> list = new ArrayList<>(set);
		Collections.sort(list);
		
		for(String temp : list) {
			if(temp.startsWith("A") || temp.startsWith("B")) {
				System.out.println(temp);
			}
		}
	}
	
}
