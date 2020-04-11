package com.andreamazzon.session2.overloadingmethods;

/**
 * This class gives a very simple example of overloading: we have two methods names print, one with no
 * arguments, which prints a "default" message, and one with a string arguments, which print the message
 * plus the string
 *
 * @author Andrea Mazzon
 *
 */

public class OverloadedPrinter {
	void print() {
		System.out.println("This is a print method");
	}

	void print(String s) {
		System.out.println("This is a print method,  printing " + s);//note again the + operator for strings
	}
}

