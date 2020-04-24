package com.andreamazzon.session5.packageaccessinterfaces;

/**
 * This class is public, even if it implements a package access interface.
 *
 * @author Andrea Mazzon
 *
 */
public class ImplementingClass implements PackageAccessInterface {

	@Override
	public void methodToBeImplemented() {//it has to be public!
		System.out.println("Implementation of the interface method");
	}
}
