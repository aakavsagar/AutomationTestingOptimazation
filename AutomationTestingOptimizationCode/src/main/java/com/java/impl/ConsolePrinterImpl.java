package com.java.impl;

import com.demo.IPrintable;

public class ConsolePrinterImpl implements IPrintable {

	@Override
	public void print() {
		System.out.println("Printing on the console");
	}

}
