package com.tests;

import com.demo.IPrintable;
import com.java.impl.ConsolePrinterImpl;

public class TestRunner_AnonymousInner {
	public static void main(String[] args) {
		IPrintable obj = new IPrintable() {
			
			@Override
			public void print() {
				System.out.println("From anonymous inner class");
			}
		};
		
		obj.print();
	}
}
