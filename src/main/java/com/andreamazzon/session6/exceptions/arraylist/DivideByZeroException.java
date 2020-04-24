package com.andreamazzon.session6.exceptions.arraylist;

//Exception is a class, when you write an Exception you extend it
public class DivideByZeroException extends Exception{
	void print() {
		System.out.println("You are dividing by zero");
	}
}
