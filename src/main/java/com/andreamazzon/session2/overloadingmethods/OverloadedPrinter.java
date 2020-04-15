package com.andreamazzon.session2.overloadingmethods;

/**
 * This class gives a very simple example of overloading: we have two methods names print, one with no
 * arguments, which prints the string contained in the messageToBePrinted field of the class, and one with
 * a string argument, which prints the string
 *
 * @author Andrea Mazzon
 */
public class OverloadedPrinter {

	String messageToBePrinted;

	//note: these two methods do the same thing (printing a message) in two different ways
	void print() {
		System.out.println(messageToBePrinted);
	}

	void print(String s) {
		System.out.println(s);//note again the + operator for strings
	}
}

