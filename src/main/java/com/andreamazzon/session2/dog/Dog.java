package com.andreamazzon.session2.dog;

/**
 * This class serves as an easy example of method overloading: you have here fours methods whose name is bark,
 * but whose implementation is different depending on the type of the argument.
 *
 * @author Andrea Mazzon
 */
public class Dog {

	void bark() {
		System.out.println("Woof, woof");
	};

	void bark(int t) {
		System.out.println("Arf, arf");
	};

	void bark(double d) {
		System.out.println("Auuuuuuhhhhh");
	};

	void bark(String string) {
		System.out.println(string);
	}

}
