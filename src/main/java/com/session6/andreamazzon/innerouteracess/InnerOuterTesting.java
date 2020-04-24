package com.session6.andreamazzon.innerouteracess;


public class InnerOuterTesting {
	public static void main(String[] args) {
		Outer outer = new Outer();//object of the outer class
		Outer.Inner innerObject = outer.new Inner();//object of the inner class /note the syntax!)
		System.out.println("Outer field: " + innerObject.returnOuterField()); //returnOuterField method of the inner class
		System.out.println("Inner field: " + outer.returnInnerField());//returnInnerFieldMethod of the outer class
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);
	}
}