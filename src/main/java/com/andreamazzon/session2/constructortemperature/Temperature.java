package com.andreamazzon.session2.constructortemperature;

/**
 * This class has two constructors: a default constructor an doverloaded constructor which takes a
 * double as parameter and sets the value of the temperature equal to that value.
 *
 * @author: Andrea Mazzon
 */
public class Temperature {
	double temperature=0;

	//overloaded constructor: it is used to specify the value of the temperature
	Temperature(double t) {
		temperature = t;
		System.out.println("Overloaded constructor");
	}

	//default constructor: it leaves the value of the temperature equal to the default, i.e., 0
	Temperature(){
		System.out.println("Default constructor: the temperature will be equal to 0");
	}

}
