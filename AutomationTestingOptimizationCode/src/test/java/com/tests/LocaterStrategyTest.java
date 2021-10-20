package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.LocatorFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocaterStrategyTest {
	private By hamburgermenu = By.id("nav-hamburger-menu");
	private String menuitem = "//div[text()='%s']/parent::a";
	
	@Test
	public void locatorStrategyTest() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		click(driver,hamburgermenu);
		//click(driver,"xpath",String.format(menuitem, "Mobiles, Computers"));
		
	}

	public void clickUsingJava8(ChromeDriver driver, String locator, String value) {
		By by = LocatorFactory.getByLocator(locator.toUpperCase(), value);
		click(driver, by);
	}

	private void click(ChromeDriver driver, By by) {
		driver.findElement(by).click();
	}
	
	/*private void click(ChromeDriver driver, String locator, String value) {
		if(locator.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).click();
		}
		else if(locator.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(value)).click();
		}
		else if(locator.equalsIgnoreCase("name")) {
			driver.findElement(By.name(value)).click();
		}
		else {
			throw new RuntimeException("Locator strategy not found");
		}
	}*/
}
