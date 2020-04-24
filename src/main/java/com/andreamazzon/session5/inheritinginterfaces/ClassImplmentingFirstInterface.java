package com.andreamazzon.session5.inheritinginterfaces;

public class ClassImplmentingFirstInterface implements FirstInterface {

	@Override
	public void firstMethod() {
		System.out.println("Implementation of method 1, specific of this class");
	}

}
