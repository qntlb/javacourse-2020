package com.andreamazzon.session6.exceptions.divisions;

/**
 * The main method in this class shows you the syntax you use when calling a method that can throw one or
 * more exceptions.
 *
 * @author Andrea Mazzon
 *
 */
public class ExceptionChecker {

	public static void main(String[] args) {
		double maxValue = 1000000000;
		double minValue = 0.000000001;
		double firstDividend = 1;
		double divisor = 0.1;
		//Divider.divide(firstDividend, divisor, minValue, maxValue);//you cannot call it in this way, because of possible exceptions

		//the code by which exceptions can derive is surrounded by brackets, after "try"
		try {
			Divider.divide(firstDividend, divisor, minValue, maxValue);
		}
		//list of the possible exceptions: you have to list them all or throw the missing exception.
		catch (UnderFlowException exception) {
			exception.print();//you catch the object thrown and you ask it to call the method print()
		}
		catch (OverFlowException exception) {
			exception.print();
		}
		catch (DivideByZeroException exception) {
			exception.print();
		}
	}
}
