package com.andreamazzon.session6.generics.genericinterfaces;

/**
 * All classes implementing this interface must implement a generic method next(), which return an object.
 * We do not specify now the type of the object returned, but it has to be the same for every object calling
 * the method.
 *
 * @author Andrea Mazzon
 *
 */
public interface GenericPointer<T> {
	T next();//can be whatever, but always the same type for a given object of a class implementing the method
}
