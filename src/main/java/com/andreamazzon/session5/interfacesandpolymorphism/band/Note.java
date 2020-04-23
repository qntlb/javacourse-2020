package com.andreamazzon.session5.interfacesandpolymorphism.band;


/**
 * enum type: it is useful when you have to group together and use a set of
 * constant values (enumerated types). Here we create twelve name values, which
 * represent notes.
 * You can think about enum as a class, which has some useful methods like
 * ordinal(), to indicate the declaration order of a particular enum constant, and
 * values(), a method that produces an array of values of the enum constant in the
 * order they were declared.
 *
 * @author Andrea Mazzon
 *
 */
public enum Note {
	//they are capitalized as they are constant: it's a convention
	C, C_SHARP, D, D_SHARP, E, F, F_SHARP, G, FLAT_A, A, A_SHARP, B
}


