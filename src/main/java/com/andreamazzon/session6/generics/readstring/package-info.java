/**
 * The code in this package, together with the one in com.andeamazzon.session6.generics.fibonacci,
 * shows an example of the use of generics. The class CharactersOfString here and the class
 * FibonacciSequence in the package above both implement the interface GenericPointer defined in
 * com.andeamazzon.session6.generics.genericinterfaces. The method returns a Character in this case and an
 * Integer in FibonacciSequence. So it made sense to avoid to set the return type in the definition of
 * next() in the interface. However, we wanted to be consistent, i.e., that the return type is the same
 * for every object of a class implementing next(): we did not want a possible implementation of next(),
 * specific of a class, to give one time an Integer and the other a Double. So we used generics in
 * GenericPointer.
 * In the case of this package, the implementation of next() gives a way to read and return the characters
 * of a string, when called iteratively.
 */
package com.andreamazzon.session6.generics.readstring;