package com.andreamazzon.session6.generics.containers;

/**
 * This is a container for an object of whatever type: Object is the largest class in Java, everything
 * is an Object, i.e., all the classes implicitly extend Object.
 *
 * @author Andrea Mazzon
 *
 */
class ObjectTypeClass {

	private Object genericField; // T is the "type parameter"

	//polymorphism at its maximum! You can give whatever object as an argument
	public void setA(Object a) {
		this.genericField = a;
	}
	public Object getA() {
		return genericField;
	}
}

