package com.andreamazzon.session2.calculator;

/**
 * This class offers a very simple example of the fact that a static method can be called without constructing
 * an object of the class where the method is defined
 *
 * @author Andrea Mazzon
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {

		//Calculator calculator=new Calculator(); //not needed
		int a=5;
		int b=7;

		double result=Calculator.computeRatio(a, b);
		System.out.println("The ratio of " + a + " and " + b + " is: " + result );
	}
}
