package com.andreamazzon.session5.interfaceexample;

/**
 * This class implements the interface Cure, as it gives an implementation to the two methods defined
 * in Cure.
 *
 * @author Andrea Mazzon
 *
 */
public class Doctor implements Cure {
	/*
	 * note that you have to declare the method to be public. Methods of interfaces are implicitly public,
	 * so you can avoid to specify it when you define the interface. However, you have to declare them
	 * as public in the classes implementing the interface.
	 */
	@Override
	public void diagnose() {
		System.out.println("You just have a bad cold");
	}

	@Override
	public void heal() {
		System.out.println("Take some aspirines!");
	}

	//however, it can also have some own methods:
	public void aDoctorMethod() {
		System.out.println("My own method");
	}
}

