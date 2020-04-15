package com.andreamazzon.session2.thisleaves;

/**
 * In this class we show two examples of the use of this: allowing the argument name of the constructor to match
 * the field name, see also com.andreamazzon.session2.divisiblewithconstructor.CheckDivisibleWithConstructor,
 * and to return a reference of the object calling the method.
 *
 * @author Andrea Mazzon
 */
public class Leaf {

	int i;

	/*
	 * The constructor here uses 'this' to allow the argument name to match the field name:
	 * the constructor sets the data field this.i to the value of the argument i. The keyword
	 * this resolves the name clash (otherwise the local variable/parameter "shadows" the field).
	 */
	Leaf(int i) {
		this.i = i;
	}

	/*
	 * The method illustrates a second use of is: the method returns a reference to the object which
	 * calls the method (note the Leaf return). This allows multiple calling, see row 12 in MainLeaf.
	 */
	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

}

