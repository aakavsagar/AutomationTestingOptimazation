package com.tests;

import com.demo.IPrintable;
import com.java.impl.ConsolePrinterImpl;

public class TestRunner {
	public static void main(String[] args) {
		IPrintable obj = new ConsolePrinterImpl();
		obj.print();
	}
}
