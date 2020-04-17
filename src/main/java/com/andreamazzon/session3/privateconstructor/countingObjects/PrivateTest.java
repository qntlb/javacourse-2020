package com.andreamazzon.session3.privateconstructor.countingObjects;

/**
 * This class shows the use of the class PrivateConstructorClass. We see how, thanks to
 * our implementation of PrivateConstructorClass, it is possible to create only a single
 * object of that class.
 *
 * @author Andrea Mazzon
 *
 */
public class PrivateTest{
	public static void main(String[] args){
		//the private constructor is called from inside the class VaryPrivateClass
		PrivateConstructorClass firstObject= PrivateConstructorClass.CreateOneObject();
		PrivateConstructorClass secondObject= PrivateConstructorClass.CreateOneObject();
	}


}
