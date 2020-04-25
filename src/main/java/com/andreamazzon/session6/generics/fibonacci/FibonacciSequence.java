package com.andreamazzon.session6.generics.fibonacci;

import com.andreamazzon.session6.generics.genericinterfaces.GenericPointer;

/**
 * This class implements the generic interface GenericPointer, for type Integer. It is the used to compute
 * the first numbers of a Fibonacci sequence.
 *
 * @author Andrea Mazzon
 *
 */
public class FibonacciSequence implements GenericPointer<Integer> {//I give the type of the type returned in next()
	private int count = 1;

	/**
	 * It returns the Fibonacci number F_k, k=count, and set count = count + 1.
	 */
	@Override
	public Integer next() {
		return fib(count++);
	}

	/**

	 * @param n
	 * @return the Fibonacci number F_n=F_{n-1}+F_{n-2}, if n>2.
	 */
	private int fib(int n) {
		if (n < 3) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}

}
