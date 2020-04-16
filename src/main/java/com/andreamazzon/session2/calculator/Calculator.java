package com.andreamazzon.session2.calculator;

/**
 * Very simple example of static methods: here you can note that the static method does not depend on non
 * static fields of the class (the class actually has only one field, which is non static).
 *
 * @author Andrea Mazzon
 */
public class Calculator {

	double number;//field of the class. It is not static

	/*
	 * static method: it is not tied to the specific value of the non static fields of the class, and so to the
	 * state of the objects of the class
	 */
	static double computeRatio(double a, double b){
		return a/b;
	}

	/*
	 * this is method cannot be static: it has access to the (non static) fields of the class, it depends on the
	 * state of every object of the class
	 */

	double computeHalfOfNumber() {
		return number/2; //field of the class!
	}
}
