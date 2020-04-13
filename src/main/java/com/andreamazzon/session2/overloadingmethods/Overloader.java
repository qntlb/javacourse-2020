package com.andreamazzon.session2.overloadingmethods;

/**
 * Very simple example of overloading: by running it you can note two different behaviors of the print
 * method of OverloadedPrinter accordingly to the argument list.
 *
 * @author Andrea Mazzon
 */
public class Overloader {

	public static void main(String[] args) {

		OverloadedPrinter printer = new OverloadedPrinter();//just the default constructor

		printer.print();//no arguments: a default message will be printed
		printer.print("hello!"); //this string is added to the message

	}
}

