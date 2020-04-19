package com.andreamazzon.session4.polymorphism.amphibians;

/**
 * This class tests overriding, upcasting and polimorphism, see the comments in Amphibian.
 */
public class TestClass {


	public static void main(String[] args) {

		Frog frog = new Frog();

		frog.swimming(); // overridden version are called, that is those of Frog
		frog.walking();
		frog.creaking();

		Frog secondfrog = new Frog();

		Amphibian.behavior(secondfrog); // Upcasting and methods overridden! Returns a frog behaviour!!
		Amphibian amphibian = new Amphibian();
		Amphibian.behavior(amphibian);
	}
}