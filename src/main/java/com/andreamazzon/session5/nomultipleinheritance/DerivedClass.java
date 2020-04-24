package com.andreamazzon.session5.nomultipleinheritance;

/**
 * This class extends FirstParentClass. It has a specific method and inherits the implementation
 * of foo(). If we make it SecondParentClass as well, which implementation would it inherit?
 * @author andreamazzon
 *
 */
public class DerivedClass extends FirstParentClass {

	void specificMethod() {
		System.out.println("A method of the base derived class");
	}

	void printI() {
		System.out.println(i);
	}
}
