package com.andreamazzon.session5.nameclasheswithinterfaces;

public interface AnInterface{

	//same name as in AnotherInterface! It's fine, but not if we change the return type to int
	void foo();
	void overloadedMethod(int i);

}