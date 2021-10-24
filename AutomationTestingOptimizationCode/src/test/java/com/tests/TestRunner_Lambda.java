package com.tests;

import com.demo.IPrintable;
import com.java.impl.ConsolePrinterImpl;

public class TestRunner_Lambda {
	public static void main(String[] args) {
		IPrintable obj = ()->System.out.println("From Lambda Expression");
		obj.print();
	}
}
