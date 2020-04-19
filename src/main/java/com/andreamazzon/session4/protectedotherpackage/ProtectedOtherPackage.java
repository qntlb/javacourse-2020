package com.andreamazzon.session4.protectedotherpackage;

import static com.andreamazzon.session3.useful.Print.printn;
/**
 * This classes shows the effects of the protected access modifier. It has one
 * protected field and one protected method, which will be inherited and called from
 * a class in another package.
 *
 * @author Andrea Mazzon
 *
 */
public class ProtectedOtherPackage {
	protected int i = 6;

	protected void makeDouble() {
		printn("A protected method in the another package. You can call it when you inherit");
		i = i*2;
	}

	void makeHalf() {
		i = i/2;
	}
}
