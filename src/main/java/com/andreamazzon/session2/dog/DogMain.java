package com.andreamazzon.session2.dog;

/**
 * The main method of this class demonstrates use of an overloaded method.
 *
 * @author Andrea Mazzon
 */

public class DogMain {

	public static void main(String[] args) {
		Dog snoopy = new Dog(); //snoopy is a dog!
		snoopy.bark(); //call of the method with no arguments
		snoopy.bark(2); //call of the method with int argument
		snoopy.bark(13.66); //call of the method with double argument
		snoopy.bark("cai cai"); //call of the method with string argument
	}
}
