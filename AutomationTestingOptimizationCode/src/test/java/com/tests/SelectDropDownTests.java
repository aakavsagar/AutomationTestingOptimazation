package com.tests;

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownTests {
	
	@Test
	public void dropDownTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		//selectDropdownValue(element,"text","Magenta");
		selectDropDownUsingJava8(e->e.selectByVisibleText("Magenta"), element);
		
		Thread.sleep(1000);
		
		selectDropDownUsingJava8(e->e.selectByValue("3"), element);
		
		Thread.sleep(1000);
		
		selectDropDownUsingJava8(e->e.selectByIndex(6), element);
		
	}
	
	private void selectDropDownUsingJava8(Consumer<Select> consumer, WebElement element) {
		consumer.accept(new Select(element));
	}

	private void selectDropdownValue(WebElement element, String textIndexValue, String value) {
		Select select = new Select(element);
		if(textIndexValue.equalsIgnoreCase("text")) {
			select.selectByVisibleText(value);
		}
		else if(textIndexValue.equalsIgnoreCase("value")) {
			select.selectByValue(value);
		}
		else if(textIndexValue.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(value));
		}
	}

}
