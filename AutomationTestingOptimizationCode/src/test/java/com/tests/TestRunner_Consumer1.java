package com.tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner_Consumer1 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Vidhya","Sagar","Testing");
		
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String temp : list) {
			System.out.println(temp);
		}*/
		
		Consumer<String> consumer = (s)->System.out.println(s);
		Consumer<String> consumer1 = (s)->System.out.println(s.toUpperCase());
		Consumer<String> consumer2 = (s)->System.out.println(s.toLowerCase());
		list.forEach(consumer.andThen(consumer1).andThen(consumer2));
		
		//list.forEach(System.out::println);
		System.out.println();
		System.out.println();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
		Consumer<WebElement> consumer3 = (e)->System.out.println(e.getText());
		Consumer<WebElement> consumer4 = (f)->{
			if(!f.getText().isEmpty()) {
				System.out.println(f.getText());
			}
		};
		
		elements.forEach(consumer4);
	}
}
