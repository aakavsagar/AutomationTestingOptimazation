package com.tests;

import java.util.Optional;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpTests {
	
	// Accept the popup is present else simply ignore
	
	@Test
	public void handlePopUpTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('I love Testing Mini bytes')");
		
		acceptPopUPIfPresentElseIgnoreUsingTryCatch(driver);
		Thread.sleep(1000);
		acceptPopUpIfPresentElseIgnoreUsingExpectedConditions(driver);
		
		acceptAlertUsingJava8Way(driver);
	}

	private void acceptAlertUsingJava8Way(WebDriver driver) {
		Optional.ofNullable(ExpectedConditions.alertIsPresent().apply(driver)).ifPresent(Alert::accept);
	}

	private void acceptPopUpIfPresentElseIgnoreUsingExpectedConditions(WebDriver driver) {
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null) {
			driver.switchTo().alert().accept();
		}
	}

	private void acceptPopUPIfPresentElseIgnoreUsingTryCatch(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e) {
			System.out.println("Eating the thrown exception, Spoiling readability");
		}
	}
}
