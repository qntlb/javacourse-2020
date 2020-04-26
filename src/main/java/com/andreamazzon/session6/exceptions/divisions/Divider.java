package com.andreamazzon.session6.exceptions.divisions;

import java.util.ArrayList;

/**
 * This class has a static void Divide method which serves as an example of how exceptions are
 * handled and thrown: you start by dividing a double firstDividend by a double Divisor. If Divisor
 * is zero, you get an exception. Otherwise,  you get the result and divide it by Divisor and so on,
 * until you reach a number smaller then minResult (and you get an underFlowException) or bigger then
 * maxResult (and you get an overFlowException).
 * Note: with ArrayList you can create an array without fixing its length (you avoid possible exceptions).
 *
 * @author Andrea Mazzon
 *
 */
public class Divider {

	static void divide(double firstDividend, double divisor, double minResult, double maxResult)
	//you have to specify the exception than can be thrown: part of method declaration
			throws UnderFlowException, OverFlowException, DivideByZeroException {
		if (divisor == 0) {
			throw new DivideByZeroException();
		}
		//an array of Doubles: it does not work with primitive types. ArrayList works with generics!
		ArrayList<Double> dividends = new ArrayList<Double>();
		//add method of ArrayList: it insert an object of the type specified at the end of the array
		dividends.add(firstDividend);
		int i = 0;
		while (true) {//a way to say that it continues indefinitely (true always true)
			//get(i) gets the element of the array in position i (always remember: starting from 0!)
			Double result = (dividends.get(i))/divisor; //you divide the previous number
			dividends.add(result); //you insert the result in your array
			System.out.println(result);

			if (result < minResult) { //underFlow!
				throw new UnderFlowException();
			}

			if (result > maxResult) {//overFlow!
				throw new OverFlowException();
			}
			i++;
		}
	}
}


