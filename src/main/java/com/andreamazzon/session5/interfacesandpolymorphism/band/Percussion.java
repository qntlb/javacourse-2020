package com.andreamazzon.session5.interfacesandpolymorphism.band;

public class Percussion implements Instrument {
	/**
	 * It prints "Percussion plays" plus the name of the Note given as argument.
	 * @param n: a value of the enum type Note
	 */
	@Override
	public void play(Note n) {//a method that take as argument the value of the enum type Note
		System.out.println("Percussion plays " + n);
	}
}
