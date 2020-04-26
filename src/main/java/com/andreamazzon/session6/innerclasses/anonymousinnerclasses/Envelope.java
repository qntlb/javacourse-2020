package com.andreamazzon.session6.innerclasses.anonymousinnerclasses;

/**
 * This class does not implement the interface Letter, but it has an anonymous inner class doing it.
 *
 * @author Andrea Mazzon
 *
 */
public class Envelope {

	public Letter getMessage() {//returns the reference of an object of a class which implements Letter
		return letter;
	}

	/*
	 * anonymous inner class! Here you say that Envelope has an inner class which implements Letter
	 * (as you see from Letter before the name of the object: you directly upcast the object created here),
	 * and that you create an object of this class (look at the -a bit odd-syntax Letter(): it's the constructor
	 * of the anonymous class which implements Letter).
	 */
	Letter letter = new Letter() {
		/*
		 * and now you give the fields and the methods of the inner class, as you do normally do: here you
		 * have a field and a method, which it is the method of the interface.
		 */
		private String content = "Dear friend...";
		@Override
		public void read() {
			System.out.println(content);
		}
	}; // semicolon compulsory: it marks the end of the expression that happens to contain the anonymous class
}

