package com.andreamazzon.session4.inheritanceandconstructors.cartoons;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Example of a derived class when the parent class has only constructors with arguments: in this case, you must
 * explicitly call the constructor of the parent class, using "super". This makes sense: you have to give
 * the arguments to the constructor you want to call. Note: if the parent class has also a default constructor,
 * its default constructor gets called if you don't specify any "super". Try to verify this behaviour adding a
 * default constructor to Drawing and the commenting out super(s).
 *
 * @author Andrea Mazzon
 *
 */
public class Cartoon extends Drawing {

	Cartoon(String s) {
		//call to the base class constructor with the appropriate argument list
		super(s); //try to comment out
		printn("I draw the cartoon " + s);
	}

	Cartoon(String s, String t) {
		//call to the base class constructor with the appropriate argument list
		super(s, t); // try to comment out
		printn("I draw the two cartoons " + s + " and " + t);
	}

}

