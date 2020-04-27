package com.andreamazzon.session6.exceptions.divisions;

//Exception is a class, when you write an Exception you extend it
@SuppressWarnings("serial")
public class OverFlowException extends Exception { // not an important warning
	public void print() {//method you want to call when you catch the exception
		System.out.println("I catched an overflow exception");
	}
}
