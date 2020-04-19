package com.andreamazzon.session4.polymorphism.shapes;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Particular kind of shape, for which we know how to compute the area, i.e., how to implement the method
 * computeArea().
 *
 * @author Andrea Mazzon
 *
 */
public class Triangle extends Shape {

	double basis;
	double height;

	Triangle(double basis, double height){
		this.basis=basis;
		this.height=height;
	}

	/*
	 * note the @Override annotation: if we use it, we get an error if our method is not overriding a method
	 * of the parent class. This is useful to avoid mistakes (for example we are accidentally changing the name
	 * of the method)
	 */
	@Override
	double computeArea() {
		printn("Computing the area of this triangle..");
		return basis*height/2;
	}

}
