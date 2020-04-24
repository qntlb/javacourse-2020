package com.andreamazzon.session6.exceptions.arraylist;

//Exception is a class, when you write an Exception you extend it
public class UnderFlowException extends Exception { // not an important warning
	void print() {
		System.out.println("I catched an undeflow exception");
	}
}
