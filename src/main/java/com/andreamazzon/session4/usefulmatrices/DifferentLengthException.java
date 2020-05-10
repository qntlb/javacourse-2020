package com.andreamazzon.session4.usefulmatrices;

/**
 * Exception is a class, when you write an Exception you extend it
 *
 * @author Andrea Mazzon
 */
public class DifferentLengthException extends Exception { // not an important warning
	public void print() {
		System.out.println("The arrays have different length");
		// System.exit(0);
	}
}
