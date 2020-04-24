package com.andreamazzon.session5.multipleinterfaceimplementation.animals;


/**
 * Multiple implementation: this class implements both the interfaces, and then both the methods.
 * Note: multiple inheritance not allowed with (even abstract) classes
 *
 * @author Andrea Mazzon
 *
 */
public class Duck implements AnimalThatSwims, AnimalThatFlies {

	@Override
	public void swim() {//methods defined in the interface have to be public!
		System.out.println("a duck swims");
	}

	@Override
	public void fly() {//methods defined in the interface have to be public!
		System.out.println("a duck flies");
	}

	@Override
	public void sameMethod() {//methods defined in the interface have to be public!
		System.out.println("implementation");
		//System.out.println(sameField);//POSSIBLE CONFLICT!
	}
}
