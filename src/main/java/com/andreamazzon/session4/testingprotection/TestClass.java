package com.andreamazzon.session4.testingprotection;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class shows some examples about how protected fields and methods can be accessed and called. We show
 * that they have package access (that it, protected is less restrictive of package access) and that they can
 * be accessed and called in methods of classes inheriting from the class where they are defined (remember
 * that derived classes automatically inherit methods and fields of the base class).
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {
	public static void main(String[] args) {

		/*
		 * This class is in the same package of ProtectedSamePackage. For this reason, methods and fields
		 * of ProtectedSamePackage can be accessed from here (main is of course a method of TestClass)
		 */
		ProtectedSamePackage protectedSamePackage = new ProtectedSamePackage();
		printn("The value of the protected field of the class in the same package is " + protectedSamePackage.j);
		protectedSamePackage.makeDouble(); // You can See it because protectedClass is in the same package
		printn("And now is " + protectedSamePackage.j);

		/*
		 * protected fields and methods can be accessed in other packages when they are inherited from the
		 * class from which they are called
		 */
		DerivedClass derived = new DerivedClass(10);
		printn("The value of the field that the derived class inherits from the base one is  ");
		derived.printField();
		derived.computeSinOfDouble();
		printn("And now  ");
		derived.printField();
	}

}
