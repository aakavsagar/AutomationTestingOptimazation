package com.tests;

import java.util.function.Supplier;

import org.testng.annotations.Test;

public class TestRunner_Supplier {

	private Supplier<Double> supplier = () -> Math.random();
	private Supplier<String> stringSupplier = ()->"Hello world";

	@Test
	public void Test1() {
		System.out.println(supplier.get());
		System.out.println(stringSupplier.get());
	}
}
