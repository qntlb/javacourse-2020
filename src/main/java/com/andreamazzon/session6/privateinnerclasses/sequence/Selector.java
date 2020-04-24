package com.andreamazzon.session6.privateinnerclasses.sequence;

/**
 * Interface with three (implicitly public!) methods
 *
 * @author Andrea Mazzon
 *
 */
interface Selector {
	boolean end(); //it must be implemented in order to return a boolean
	int current(); //it must be implemented in order to return a int
	void goNext();//it must be implemented, void
}
