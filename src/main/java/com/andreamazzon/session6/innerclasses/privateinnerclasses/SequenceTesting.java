package com.andreamazzon.session6.innerclasses.privateinnerclasses;


/**
 * This class contains a main method which illustrates how objects of the inner class are created from objects of
 * the outer class. Moreover, it calls the methods implemented in the inner class.
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
		 * In order to create an object of the inner class, you need an object of the outer class:
		 * the object of the inner class is connected to the one of the outer class. Here, since
		 * the inner class SequenceSelector is private, you can create an object of SequenceSelector
		 * using the getter method of the outer class Sequence. You see that you upcast it to the
		 * Interface Selector implemented by SequenceSelector. This is fine, since its only
		 * public methods are the ones of the interface. In this way, you really hide everything
		 * not regarding the methods of the interface from the user: the user do not even know
		 * of which class selector is.
		 */
		Selector selector = sequence.getSequenceSelector();
		//Sequence.SequenceSelector selector = sequence.new SequenceSelector();//private!
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.goNext();
		}
	}
}

