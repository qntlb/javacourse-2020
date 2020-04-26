/**
 * The code in this package, together with the one in com.andeamazzon.session6.generics.readstring,
 * shows an example of the use of generics. The class Fibonacci here and the class CharactersOfString
 * in the package above both implement the interface GenericPointer defined in
 * com.andeamazzon.session6.generics.genericinterfaces. The method next() defined in GenericPointer returns
 * an Integer in this case and a Character in CharactersOfString. So it made sense to avoid to set the
 * return type in the definition of next() in the interface. However, we wanted to be consistent, i.e., that
 * the return type is the same for every object of a class implementing next(): we did not want a possible
 * implementation of next(), specific of a class, to give one time an Integer and the other a Double.
 * So we used generics in GenericPointer.
 * In the case of this package, the implementation of next() gives an easy way to return the numbers
 * of the Fibonacci sequence, when called iteratively.
 */
package com.andreamazzon.session6.generics.fibonacci;