package com.andreamazzon.session2.thisleaves;

/**
 * This class is an example of overloaded constructor and of the use of this to call a (usually overloaded)
 * constructor inside a constructor. We have four constructors, with different arguments lists.
 *
 * @author Andrea Mazzon
 */
public class Flower {

	int petalCount = 0;
	String s = "some text";

	Flower(int petals) {
		petalCount = petals; //it sets the value of petalCount
		System.out.println("Constructor with int, petalCount= " + petalCount);
	}

	Flower(String s) {
		this.s = s;//use of this to allow the argument name to match the field name
		System.out.println("Constructor with string, s = " + this.s);
	}


	Flower(String s, int petals) {
		this(petals); // it calls the constructor whose signature is integers only!
		this.s = s; // Another use of "this"!!

		//this(s); // Can’t call two!
		System.out.println("Constructor with string and petals, String & int args");
	}

	//default constructor
	Flower() {
		this("A bonus message", 42);

		System.out.println("Default constructor (no args)");
	}

	void printPetalCountAndString() {
		// ! this(11); // Not inside non-constructor!
		System.out.println("petalCount = " + petalCount + ", s = " + s);
	}

}
