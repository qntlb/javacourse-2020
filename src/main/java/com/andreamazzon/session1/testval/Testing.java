package com.andreamazzon.session1.testval;

/**
 * In this class we choose three values and test if the first one lies inside the interval defined by the first two.
 * We use the class comparison
 *
 * @author Andrea Mazzon
 */
public class Testing {

	public static void main(String[] args) {
		Comparison test = new Comparison(); //we construct an object of type Comparison
		System.out.println("The result of the first test is: " + test.eval(1, 2, 3)/*method called inside the println*/);
		System.out.println("The result of the second test is: " + test.ternaryEval(1, 0, 3));
	}
}

