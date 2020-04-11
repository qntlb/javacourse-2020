package com.andreamazzon.session2.cosine;

/**
 * This class is used to compute the cosine of a given number. This is done in a method which takes a double as
 * argument. In particular, if the number is not "divisible" by Pi, the cosine is computed by the standard
 * Math.Pi method. Otherwise, an overloaded method is called with int argument: the argument in this case is the
 * ratio between the given number and Pi.
 *
 * @author Andrea Mazzon
 *
 */
public class CosineOverload {
	/**
	 * Computes the cosine of a given number
	 * @param double x
	 * @return cos(x)
	 */
	double calculateCosine(double x){
		if(x % Math.PI !=0) {
			return Math.cos(x); //standard computation
		}else {
			int n=(int) (x/Math.PI);//ratio between x and Pi. Downcasted! We know that it s an int because x % Math.PI = 0
			return calculateCosine(n);//the overloaded method is called!
		}
	}
	/**
	 * Computes cos(x), when x=n*Pi
	 * @param int n = x/Pi
	 * @return cos(x)
	 */
	double calculateCosine (int n){
		System.out.println("I am using the overloaded version");
		//cos(2*n*Pi)=1, cos((2n+1)*Pi)=-1;
		if(n%2 == 0)
			return 1;
		else
			return -1;
	}

}

