package com.andreamazzon.session2.treesconstructor;

/**
 * This class gives an extremely simple example of constructor with arguments: the height of the
 * three is specified by the double argument of the constructor
 *
 * @author Andrea Mazzon
 */
public class Tree {

	double height;
	//constructor with a double argument
	Tree(double heightOfTheNewTree){
		System.out.println("A new tree is planted");
		/*
		 * note: height is the name of field of the class; heightOfTheNewTree is the name of the variable given
		 * as an argument. If they have the same name, they both refer to the argument variable, and the
		 * assignment has no effect. We will see a way to solve this problem.
		 */
		height = heightOfTheNewTree;
	}

	/*
	 * note that we don't define a default constructor: since we defined a constructor, Java will not
	 * do it for us. If we call the default constructor in the main, we will get an error.
	 */
}
