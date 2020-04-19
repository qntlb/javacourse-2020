package com.andreamazzon.session4.polymorphism.shapes;

import java.util.Random;


/**
 * This class illustrates an use of upcasting: the method nextShape() returns an object of type Shape, but
 * actually we return a Circle, a Square or a Triangle. This is possible because they get automatically upcasted
 * to Shape when returned: the reference to a Circle can be also treated as a reference of a Shape.
 * Note again the use of the nextInt() method of Random.
 *
 * @author Andrea Mazzon
 *
 */
public class RandomShapeGenerator {

	private double basisOfTriangle;
	private double heightOfTriangle;
	private double sideOfSquare;
	private double radiusOfCircle;

	private Random rand = new Random();//random number generator


	RandomShapeGenerator(double basisOfTriangle, double heightOfTriangle, double sideOFSquare,
			double radiusOfCircle) {
		this.basisOfTriangle = basisOfTriangle;
		this.heightOfTriangle = heightOfTriangle;
		this.sideOfSquare = sideOFSquare;
		this.radiusOfCircle = radiusOfCircle;
	}



	Shape nextShape() { // Upcasting in the return type
		switch (rand.nextInt(3)) {//0,1 or 2
		/*
		 * note that it does not execute the instruction that follows even if there is
		 * no break: can you tell why?
		 */
		default: ; //compulsory. Can you tell why it has to be at the beginning?
		case 0:
			return new Circle(radiusOfCircle); // upcasted to Shape.
		case 1:
			return new Square(sideOfSquare); // upcasted to Shape
		case 2:
			return new Triangle(basisOfTriangle , heightOfTriangle); // upcasted to Shape
		}
	}
}