package com.andreamazzon.session6.innerclasses.parcel;


/**
 * This is a first, simple example of a class which contains
 * two inner classes. Note how  they are defined exacply in the
 * same way as if they were defined outside the class.
 *
 * @author Andrea Mazzon
 *
 */


public class Parcel {

	/**
	 * Inner class with a private field and a public getter.
	 *
	 * @author Andrea Mazzon
	 *
	 */
	public class Duration {
		private int days = 11;
		public int getValue() {
			return days;
		}
	}

	/**
	 * Inner lass with a private (string) field, an overloaded constructor
	 * and a public getter.
	 *
	 * @author Andrea Mazzon
	 *
	 */
	public class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		public String getLabel() {
			return label;
		}
	}

	/**
	 * Method of the outer class that creates objects of the inner
	 * class and call methods for these objects
	 * @param destinationName, string to be given to the constructor of Destination.
	 */
	public void Ship(String destinationName) {
		Duration c = new Duration();
		Destination d = new Destination(destinationName);
		System.out.print("I go to " + d.getLabel());
		System.out.println(" for " + c.getValue() + " days");
	}

	public static void main(String[] args) {
		Parcel p = new Parcel();
		p.Ship("Thailand");
	}
}

