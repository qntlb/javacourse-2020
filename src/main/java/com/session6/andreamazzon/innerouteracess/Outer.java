package com.session6.andreamazzon.innerouteracess;

/**
 * This class contains a private int field, which is
 * accessed by its inner class. The inner class has also
 * a private int field, which is accessed by the outer class
 * after producing an object of the inner class.
 *
 * @author Andrea Mazzon
 *
 */
public class Outer {

	private int outerField = 10; //private!

	public int returnInnerField() {
		Inner inner = new Inner(); //new object of the inner class
		return inner.innerField; //innerField field
	}

	/**
	 * Inner class of an outer class. It can access its private field.
	 *
	 * @author Andrea Mazzon
	 *
	 */
	class Inner {
		private int innerField = 8;//its own private field
		public int returnOuterField() {
			return outerField; //it simply accesses it
		}
	}

}
