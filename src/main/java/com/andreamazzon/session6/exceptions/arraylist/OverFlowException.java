package com.andreamazzon.session6.exceptions.arraylist;

//Exception is a class, when you write an Exception you extend it
public class OverFlowException extends Exception { // not an important warning
	void print() {
		System.out.println("I catched an overflow exception");
	}
}
