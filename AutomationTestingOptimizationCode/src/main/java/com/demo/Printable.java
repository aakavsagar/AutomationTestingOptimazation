package com.demo;

@FunctionalInterface
public interface Printable<T> {
	
	public abstract void print(T t);
	
	//1. Consumer   void (T t)
	//2. Supplier   T ()
	//3. Predicate  boolean (T t)
	//4. Function   U (T t)
	
	
}
