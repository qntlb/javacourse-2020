package com.andreamazzon.session6.nestedclasses;

public class NestedTest {

	public static void main(String[] args) {
		/*
		 *  creating an object of a static inner class. You can note
		 *  that now you don't need an object of the outer class.
		 */
		Outer.StaticInner staticInner = new Outer.StaticInner();

		int outerData = staticInner.getOuterStaticData();
		System.out.println(outerData);
	}

}
