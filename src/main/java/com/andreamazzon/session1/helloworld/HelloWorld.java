package com.andreamazzon.session1.helloworld;//first line: package your file belongs to

//Javadoc documentation
/**
 * This class prints the classic hello world message
 *
 * @author Andrea Mazzon
 *
 */

//note how a class is created: class keyword followed by the name. More about "public" in some time
public class HelloWorld {//same name of the file! Otherwise the compiler would complain, because the class is public.
	//class body between brackets

	//public, static: we will see the meaning later on
	public static void main(String[] args) { // Entry point: the argument is an array of string objects

		String myString = "Hello world!";//we create a String reference and we initialize it (we connect it to an object)
		//or:
		//String myString = new String("Hello world!"); //typical way to construct objects: more about this later on

		//it can also be done separately:
		String myNewString; //creation of the string reference
		myNewString = "Hello again!"; //initialization. You get an error at running time if you try to use myNewString without initializing it
		System.out.println(myString); // we print the string inside parenthesis plus a new line.
		//This is part of a library of classes that are automatically brought into every Java file
		System.out.println(myNewString); // Printing

	}
}

