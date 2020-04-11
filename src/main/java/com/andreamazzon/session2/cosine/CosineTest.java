package com.andreamazzon.session2.cosine;

/**
 * This class illustrates methods overloading by the computation of the cosine of a given number.
 *
 * @author Andrea Mazzon
 *
 */

public class CosineTest {

	public static void main(String[] args) {
		double x=1.2;
		CosineOverload cosineOverload=new CosineOverload();//construction of the object
		//call of the method with argument double
		System.out.println("The cosine of " + x + " is " + cosineOverload.calculateCosine(x));

		double multipleOfPi = 5*Math.PI;
		/*
		 * the method with argument double is first called. Anyway, it will call the overloaded method with
		 * int argument (see the implementation)
		 */
		System.out.println("The cosine of " + multipleOfPi + " is " + cosineOverload.calculateCosine(multipleOfPi));
	}
}
