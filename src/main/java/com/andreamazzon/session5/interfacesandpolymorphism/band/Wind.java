package com.andreamazzon.session5.interfacesandpolymorphism.band;

public class Wind implements Instrument {
	/**
	 * It prints "Wind plays" plus the name f the Note given as argument.
	 * @param n: a value of the enum type Note
	 */
	@Override
	public void play(Note n) {//a method that take as argument the value of the enum type Note
		System.out.println("Wind plays " + n);
	}


	public void specificWind() {
		System.out.println("specific wind ");
	}
}
