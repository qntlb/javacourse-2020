package com.andreamazzon.session2.calculator;

/**
 * This class offers a very simple example of the fact that a static method can be called without constructing
 * an object of the class where the method is defined. We have seen that it is not tied to the specific state
 * of the objects of the class where it is defined. We show the difference with a nopn static method.
 *
 * @author Andrea Mazzon
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {

		Calculator firstCalculator=new Calculator();
		firstCalculator.number = 4.4;//we give a value to this fields, SPECIFICALLY FOR THIS OBJECT
		//this method depends on the value of the field number, i.e., on the state of the object calling the
		double firstNonStaticResult = firstCalculator.computeHalfOfNumber();
		System.out.println("The half of " + firstCalculator.number + " is " + firstNonStaticResult );

		//new object, new value of the field number, new result returned by the method
		Calculator secondCalculator=new Calculator();
		secondCalculator.number = 2.4;
		double secondNonStaticResult = secondCalculator.computeHalfOfNumber();
		System.out.println("The half of " + secondCalculator.number + " is " + secondNonStaticResult );

		/*
		 * now static method: these are values passed to the method, which does not depend on the values of non static
		 * fields of the class.
		 */
		double a=5;
		double b=7;


		double result=Calculator.computeRatio(a, b);//called just by typing the name of the class
		System.out.println("The ratio of " + a + " and " + b + " is: " + result );
	}
}
