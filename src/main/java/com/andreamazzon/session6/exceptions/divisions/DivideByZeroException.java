package com.andreamazzon.session6.exceptions.divisions;

//Exception is a class, when you write an Exception you extend it
@SuppressWarnings("serial")
public class DivideByZeroException extends Exception{
	void print() {//method you want to call when you catch the exception
		System.out.println("You are dividing by zero");
	}
}
