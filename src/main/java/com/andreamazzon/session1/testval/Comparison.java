package com.andreamazzon.session1.testval;

/**
 * This class is used to check if a given number is inside an interval. Example of if/else statement with logic
 * operators
 *
 * @author Andrea Mazzon
 */
public class Comparison {

	//note: Javadoc documentation of a method: we explain which are the parameters and the return value
	/**
	 *	The method evaluates if a number is inside an interval
	 *
	 * @param testvalue: number which has to be tested
	 * @param begin: left end of the interval
	 * @param end: right end of the interval
	 * @return true if testval is inside the interval, false if not
	 */
	boolean /*boolean: the method returns a boolean (i.e., true or false)*/ eval(int testvalue, int begin, int end) {
		if (testvalue < begin || testvalue > end) {
			/*
			 * the return keyword has two purposes: it specifies what value a method will return (if the method
			 * doesn’t have a void return value) and it immediately ends the method.
			 */
			return false;
		}
		else {
			return true; //since the method returns a boolean, you must have a return statement in both cases
		}
	}

	//Another way to do it:
	/**
	 *	The method evaluates if a number is inside an interval
	 *
	 * @param testvalue: number which has to be tested
	 * @param begin: left end of the interval
	 * @param end: right end of the interval
	 * @return true if testval is inside the interval, false if not
	 */
	boolean compactEval(int testvalue, int begin, int end) {
		/*
		 * the operator "!" applied to a boolean returns the opposite of its value: false if the value of
		 * the boolean is true and true if it is false
		 */
		return !(testvalue < begin || testvalue > end);
	}

	/**
	 *
	 * @param testval: number which has to be tested
	 * @param begin: left end of the interval
	 * @param end: right end of the interval
	 * @return 1 if testval is inside the interval, 0 if not
	 */
	int ternaryEval(int testval, int begin, int end) {
		/*
		 * Ternary if-else operator. This operator is unusual because it has three operands. It is truly an
		 * operator because it produces a value, unlike the ordinary if-else statement.
		 *  The expression is of the form: boolean-exp ? value0 : value1
		 *  where boolean-exp is a boolean expression.
		 *  If boolean-exp evaluates to true, value0 is evaluated and its result becomes the value produced
		 *  by the operator. If boolean-exp is false, value1 is evaluated and its result becomes the value
		 *  produced by the operator.
		 */
		return (testval < begin || testval > end) ? 0 : 1;
	}
}