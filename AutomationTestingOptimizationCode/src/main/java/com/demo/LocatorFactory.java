package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.By;

public final class LocatorFactory {
	
	private LocatorFactory() {}
	
	private static final Map<String, Function<String, By>> MAP = new HashMap<>();
	
	private static final Function<String, By> ID = By::id;
	
	private static final Function<String, By> NAME = By::name;
	
	private static final Function<String, By> XPATH = By::xpath;
	
	static {
		MAP.put("ID", ID);
		MAP.put("NAME", NAME);
		MAP.put("XPATH", XPATH);
	}
	
	public static By getByLocator(String locator, String value) {
		return MAP.get(locator).apply(value);
	}
}
