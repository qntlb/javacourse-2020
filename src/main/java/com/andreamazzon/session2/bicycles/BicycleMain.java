package com.andreamazzon.session2.bicycles;

/**
 * In the main method of this class we construct some objects of type Bycicle (i.e., instances of the class
 * Bycicle). This is to show you how the value of a static field is shared among all objects of the class, and
 * how this can be used to set a "counter" (in this case, the total cost of production).
 *
 * @author Andrea Mazzon
 *
 */
public class BicycleMain {
	public static void main(String[] striings){
		Bicycle firstBycicle = new Bicycle (3, 2500, "red");
		Bicycle secondBycicle = new Bicycle (5, 3000, "blue");
		Bicycle thirdycicle = new Bicycle (1, 2000, "black");
		Bicycle fourthBycicle = new Bicycle (7, 3000, "white");
	}
}
