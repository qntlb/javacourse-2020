package com.andreamazzon.session6.nestedclasses;


/**
 * Example of a class with a nested (= static inner) class: you construct a nested
 * class when you don't need a connection between the inner-class object and the
 * outer-class object.
 * A nested class cannot access the non static fields of the outer class.
 *
 * @author Andrea Mazzon
 *
 */
class Outer {
	private static int staticOuterField = 9;
	private int nonStaticOuterField = 3;

	public static class StaticInner {
		StaticInner() {
			System.out.println("I am a static Inner!");
		}

		int getOuterStaticData() {
			System.out.println("I can still access outer fields, provided they are static");
			return staticOuterField;
		}
		// int getOuterData() {
		// return nonStaticOuterField; //cannot make a static reference to a non static field
		// }
	}
}

