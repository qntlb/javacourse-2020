package com.andreamazzon.session4.testingprotection;

import static com.andreamazzon.session3.useful.Print.printn;

import com.andreamazzon.session4.protectedotherpackage.ProtectedOtherPackage;


/**
 * This class extends a class which is in another package. The base class contains a protected field and
 * a protected method. We observe that methods of the derived class can access the protected fields and call
 * the protected methods of the base class, which they of course inherit.
 *
 * @author Andrea Mazzon
 *
 */
public class DerivedClass extends ProtectedOtherPackage {

	DerivedClass(int i) {
		/*
		 * i gets inherited from the base class. Its value can be set from outside the package of the class
		 * where it is defined because it is protected. Try to go in ProtectedOtherPackage and make it with
		 * just package access. You see hat now you get an error here.
		 */
		this.i = i;
	}

	void printField() {
		printn(i);
	}

	void derivedMakeDouble(){
		/*
		 * makeDouble() gets inherited from the base class. It can be called from outside the package of the class
		 * where it is defined because it is protected. Try to go in ProtectedOtherPackage and make it with
		 * just package access. You see hat now you get an error here.
		 */
		makeDouble();
	}

	void derivedMakeHalf(){
		//you can't call makeHalf() because it is not protected!
		//this.makeHalf();
	}
}

