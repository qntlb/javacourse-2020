package com.andreamazzon.session6.exceptions.arraylist;

//Exception is a class, when you write an Exception you extend it
@SuppressWarnings("serial")
public class UnderFlowException extends Exception { // not an important warning
	void print() {//method you want to call when you catch the exception
		System.out.println("I catched an undeflow exception");
	}
}
