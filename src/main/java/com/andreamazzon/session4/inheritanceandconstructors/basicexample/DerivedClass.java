package com.andreamazzon.session4.inheritanceandconstructors.basicexample;

/**
 * This is a very simple example of inheritance: DerivedClass extends ParentClass (i.e., it is a
 * subclass of ParentClass). In particular, here you can see how the (default) constructor
 * of the parent class is automatically called
 *
 * @author Andrea Mazzon
 *
 */

public class DerivedClass extends ParentClass {

	DerivedClass(){
		/*
		 * the constructor of the parent class is called implicitly: when you create an object
		 * of the derived class, it will automatically contain a subobject of the parent class.
		 */
		System.out.println("Derived constructor");

	}
}

