package com.andreamazzon.session2.staticexample;

/**
 * This class illustrates the behavior of static methods and static variables, constructing objects of type
 * Tested. Main things to note:
 * - static methods can be called by just writing NameOfClass.nameOfMethod
 * - static fields are stored in one just piece of memory: once they are modified, their value changes for
 * all the objects
 *
 * @author Andrea Mazzon
 */
public class StaticTest {

	public static void main(String[] args) {

		Tested o1 = new Tested();
		Tested o2 = new Tested();

		o1.print();
		o2.print();
		System.out.println("\n");

		//we assign the value of the static field, and check that it changes for both the objects
		o1.nonStaticVariable = 2;

		o1.print();
		o2.print();

		Tested.staticModifier();//the value is incremented by 1

		System.out.println("\n");
		/*
		 * static variables are allocated in the same piece of storage for all objects of the class:
		 * if you modify it will be the same for all the objects
		 */
		o1.print();
		o2.print();
		System.out.println("\n");

		/*
		 *  also new objects of that class will have the same static variable: again, all the instances of
		 *  the class will have the same value for the static variable. It makes sense: the variable
		 *  "has not to know" which object is working for.
		 */
		Tested o3 = new Tested();
		o3.print();

		/*
		 * You can also modify static variables, or call methods from direct object calls, but this is bad practice
		 */

		//o1.staticVariable=10;
		//o2.print();
	}
}
