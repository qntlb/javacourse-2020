package com.andreamazzon.session5.interfacesandpolymorphism.band;

/**
 * This class has a static method that makes a specific type of Instrument playing a note, and a main
 * method that makes all the instruments playing some notes. Note the use of upcasting when tune
 * is called: all the objects get upcasted to the interface they are implementing.
 *
 * @author Andrea Mazzon
 *
 */
public class Band {
	/**
	 * Polymorphism: it doesn’t care about the type of the instrument, so we can give it directly
	 * an Instrument reference, even of course an object can note have a specific type of an
	 * Interface. When new types added to the system still work right.
	 */
	public static void tune(Instrument i, Note n) {
		i.play(n);
	}


	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = {new Wind(), new Percussion(), new Woodwind() };
		Note[] notes = { Note.A, Note.F_SHARP, Note.B };

		orchestra[0].play(Note.A);
		//orchestra[0].specificWind();//cannot do it, even if it is a Wind(): upcasting!
		for (Instrument i : orchestra) {
			for (Note n : notes) {
				//i.specificWind();
				tune(i, n);//upcasting of the instruments
			}
		}
	}
}
