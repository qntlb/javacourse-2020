package com.andreamazzon.session5.interfaceexample;

/**
 * This interface has two methods: diagnose() and cure(). They have to be
 * implemented by whatever class which implements this interface.
 *
 * @author Andrea Mazzon
 */
public interface Cure {
	int field = 10; //it is implicitly static and final (does not make sense here, just to show)

	void diagnose();
	void heal();
}

