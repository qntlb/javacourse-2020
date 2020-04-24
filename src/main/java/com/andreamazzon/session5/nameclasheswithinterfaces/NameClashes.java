package com.andreamazzon.session5.nameclasheswithinterfaces;


/**
 * This file illustrates possible problems due to name clashes when a class implements two interfaces
 * which have two methods with the same name, same argument list but different return types.
 *
 * @author Andrea Mazzon
 *
 */

public class NameClashes implements AnInterface, AnotherInterface{

	//No problem here
	@Override
	public void overloadedMethod(int i) {
		System.out.println("A method whose name conflict is only in the argument creates no problem; "
				+ "its implementation is just overriding");
	};

	//you can of course overload the method
	@Override
	public void overloadedMethod() {
		System.out.println("This is the other implementation");
	};

	//This does not work if you change the return type in one of the method in one of the two interfaces
	@Override
	public void foo(){
		System.out.println("What do I do?");
	}

}





