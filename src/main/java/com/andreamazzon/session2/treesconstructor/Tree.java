package com.andreamazzon.session2.treesconstructor;

/**
 * This class gives an extremely simple example of constructor with arguments: the height of the
 * three is specified by the double argument of the constructor
 *
 * @author Andrea Mazzon
 */
public class Tree {

	//constructor with a double argument
	Tree(double height){
		System.out.println("A new tree " + height + " meters high")	;
	}

	/*
	 * note that we don't define a default constructor: since we defined a constructor, Java will not
	 * do it for us. If we call the default constructor in the main, we will get an error.
	 */
}
