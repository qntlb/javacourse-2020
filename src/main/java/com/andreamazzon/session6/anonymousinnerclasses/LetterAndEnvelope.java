package com.andreamazzon.session6.anonymousinnerclasses;


/**
 * Interface Letter: your anonymous inner class will implement it.
 *
 * @author Andrea Mazzon
 *
 */
interface Letter {
	public void read();
}

class Envelope {

	public Letter getMessage() {//returns the reference of an object of a class which implements Letter
		return letter;
	}

	/*
	 * anonymous inner class! Here you say that Envelope has an inner class which implements Letter
	 * (as you see from Letter), and that you create an object of this class (look at the -a bit odd-
	 * syntax Letter(): it's the constructor of the anonymous class which implements Letter).
	 */
	Letter letter = new Letter() {
		//and now you define the class, as you do normally: a field and a method, which it has to implement
		private String content = "Dear publisher..."; // anonymous inner class : must implement outer class.

		@Override
		public void read() {
			System.out.println(content);
		}
	}; // semicolon compulsory


}

