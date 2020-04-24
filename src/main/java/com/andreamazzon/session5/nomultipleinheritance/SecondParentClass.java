package com.andreamazzon.session5.nomultipleinheritance;

/**
 * This class has a method void foo(), so  same name and same argument list as the one of FirstParentClass,
 * with a different implementation.
 *
 * @author Andrea Mazzon
 *
 */
public class SecondParentClass {

	int i = 3;

	void foo() {
		System.out.println("Implmentation of the second class");
	}

}
