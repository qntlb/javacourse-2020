package com.andreamazzon.session6.privateinnerclasses.sequence;


/**
 * This class contains a main method which illustrates how objects
 * of the inner class are created from objects of he outer class.
 * Moreover, it calls the methods implemented in the inner class.
 *
 * @author Andrea Mazzon
 *
 */
public class SequenceTesting {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		//you fill the array
		for (int i = 0; i < 10; i++) {
			sequence.append(i);
		}
		/*
		 * In one way or in another, in order to create an object of the outer class, you
		 * need an object of the inner class: the object of the inner class is connected to
		 * the one of the outer class.
		 */
		Selector selector = sequence.getSequenceSelector();
		//Sequence.SequenceSelector selector = sequence.new SequenceSelector();
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.goNext();
		}
	}
}

