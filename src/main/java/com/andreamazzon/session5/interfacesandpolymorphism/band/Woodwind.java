package com.andreamazzon.session5.interfacesandpolymorphism.band;

class Woodwind extends Wind {
	/**
	 * It prints "Woodwind plays" plus the name f the Note given as argument.
	 * @param n: a value of the enum type Note
	 */
	@Override
	public void play(Note n) {//it overrides the implementation of play(Note n) in Wind
		System.out.println("Woodwind plays " + n);
	}
}