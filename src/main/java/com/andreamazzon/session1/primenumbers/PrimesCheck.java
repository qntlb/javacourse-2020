package com.andreamazzon.session1.primenumbers;

/**
 * This class is used to check if a number is prime, by a simple for method with an if statement
 *
 * @author: Andrea Mazzon
 */
public class PrimesCheck {

	void checkIfPrime(int n) {
		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0) {//only if statement, without else
				System.out.println(n + " is not prime");
				return; //Note here another use of return: it ends the loop and the method
			}
		}
		System.out.println(n + " is prime");
	}
}
