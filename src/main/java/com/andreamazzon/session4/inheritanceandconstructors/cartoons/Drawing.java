package com.andreamazzon.session4.inheritanceandconstructors.cartoons;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Parent (or base) class: it has two constructors with different arguments
 *
 * @author Andrea Mazzon
 *
 */
public class Drawing {
	/*
	 * without defining a default constructor in the base class, super with no argument
	 * could not be called by the derived class!
	 */
	Drawing(String s){
		printn("I make one drawing.");
	}

	Drawing(String s, String t){
		printn("I make two drawings.");
	}
}
