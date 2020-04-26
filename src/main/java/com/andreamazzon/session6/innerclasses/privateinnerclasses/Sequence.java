package com.andreamazzon.session6.innerclasses.privateinnerclasses;

/**
 * This is a public access class which has two private fields. These are accessed by its private
 * inner classes. A reference to the private inner class is returned by the getSequenceSelector() method.
 *
 * @author Andrea Mazzon
 *
 */
public class Sequence {
	private int[] items; //array of integers
	private int next = 0;

	//you initialize the array to be of the length given as an argument
	public Sequence(int size) {
		items = new int[size];
	}

	/**
	 * It appends an int to the end of a sequence, if there is room left. We use it to fill the array
	 * at the beginning.
	 * @param n int to add
	 */
	public void append(int n) {
		if(next < items.length) {
			items[next++] = n;//note use of ++! items[next]=n, and then next=next+1
		}
	}


	/*
	 * This is an inner class implementing the interface Selector: note that it can access fields and
	 * methods of the enclosing class (even if they are private!) as if it owned them: useful feature of
	 * inner classes.
	 *
	 * @author Andrea Mazzon
	 *
	 */
	private class SequenceSelector implements Selector {
		private int position = 0; //position in the sequence

		/**
		 * @return true if you are at the end of a sequence, false otherwise
		 */
		@Override
		public boolean end() {
			return (position==items.length);
		}
		/**
		 * it access and returns the current int
		 */
		@Override
		public int current() {
			return items[position];
		}
		/**
		 * it moves to the next int in the sequence
		 */
		@Override
		public void goNext() {
			if (position<items.length) {
				position++;
			}
		}
	}
	public Selector getSequenceSelector() {
		return new SequenceSelector();
	}
}

