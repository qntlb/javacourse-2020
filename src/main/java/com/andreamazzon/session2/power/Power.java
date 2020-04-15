package com.andreamazzon.session2.power;

/**
 * This class gives an example of overloaded method: computePower has two arguments, the base and the
 * exponent. If the exponent is an int no problem, we just print the result. If the exponent is a double,
 * we can get problems if the base is negative. If we just use Math.pow, we get NaN. Then we want to warn
 * the user if this is the case. So we distinguish the two types of implementation (the one when the
 * exponent is int and the one when the exponent is double) by Overloading.
 *
 * @author Andrea Mazzon
 */
public class Power {

	double result; //only definition, not initialization

	/*
	 * define and implement two methods computePower, with same name but different arguments lists.
	 * In particular, one has argument list (double base, int exponent), and the other
	 * (double base, double exponent). The first one just prints the result of the exponeniation,
	 * using Math.pow(base, exponent), whereas the second one checks if base is negative and exponent
	 * is not an integer (exponent is an integer if exponent == Math.floor(exponent) is true) and in this case
	 * it prints a warning message, without computing the result. Otherwise, it computes and prints
	 * the result.
	 */

}
