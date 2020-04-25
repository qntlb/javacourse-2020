package com.andreamazzon.session6.generics.containers;

/**
 * This class is a container for a generic type, and this is specified by the
 * T inside angle brackets after the class name. You will substitute an actual type
 * when you will use the class.
 *
 * @author Andrea Mazzon
 */
class GenericClass<T> {
	/*
	 * Of course we could specify T to be object and remove the parametrization,
	 * but this would mean that DIFFERENT types could be used in any call of a
	 * method for the same object of GenericClass. But typically you will put only
	 * one type of object in a container, once you have created one (i.e., once you have
	 * created an object). This is why we use generics.
	 */
	private T genericField; // T is the "type parameter"

	public void setA(T a) {//generic constructor
		this.genericField = a;
	}

	public T getA() {//generic getter
		return genericField;
	}
}

