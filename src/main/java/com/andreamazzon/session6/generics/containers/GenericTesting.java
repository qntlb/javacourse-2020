package com.andreamazzon.session6.generics.containers;

/**
 * This class has a main method which tests generics: you can see that you can construct
 * different objects of type GenericClass, giving them different types. However, and
 * here is the difference with using Object, once you have created an object of
 * type GenericClass you cannot set its field A to be of different types.
 *
 * @author Andrea Mazzon
 *
 */
public class GenericTesting {

	public static void main(String[] args) {


		/*
		 * look at ObjectTypeClass: the field A of the same object can be set first to be a double
		 * and then a ComplexNumber. Sometimes you want to prevent this.
		 */
		ObjectTypeClass anObjectType = new ObjectTypeClass();
		anObjectType.setA(10.0);
		anObjectType.setA(new ComplexNumber(2,3));

		//THEN YOU USE GENERICS:

		//you specify Double in angle brackets, and then you call the constructor of GenericClass
		GenericClass<Double> aDoubleContainer = new GenericClass<Double>();
		//You cannot use primitives as generic types in Java! Has to be Double, the wrapper class
		aDoubleContainer.setA(10.0);//aDoubleContainer is a container of Doubles.
		Double x = aDoubleContainer.getA();
		System.out.println("Double type instantiation of the generic class. Field returns: "+ x);
		aDoubleContainer.setA(9.0);
		//aDouble.setA("char"); //you cannot set A to be of another type!

		//you specify ComplexNumber in angle brackets, and then you call the constructor of GenericClass
		GenericClass<ComplexNumber> aComplexContainer = new GenericClass<ComplexNumber>();
		aComplexContainer.setA(new ComplexNumber(2,3));//you set A to be a complex number
		ComplexNumber aComplex = aComplexContainer.getA();//you get this complex number
		System.out.println("Real part: "+ aComplex.getRealPart());
		System.out.println("Imaginary part: "+ aComplex.getImaginaryPart());

	}
}

