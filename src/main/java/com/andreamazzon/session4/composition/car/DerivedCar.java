package com.andreamazzon.session4.composition.car;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * NOT NICE AT ALL SOLUTION!!!!
 *
 * @author Andrea Mazzon
 *
 */
public class DerivedCar extends Engine{
	private int age; //specific field of this class
	private int horsepower; //specific field of this class

	//specific method of Car
	public void turnRight() {
		printn("Turn right");
	}
	//specific method of Car
	public void turnLeft() {
		printn("Turn left");
	}

}
