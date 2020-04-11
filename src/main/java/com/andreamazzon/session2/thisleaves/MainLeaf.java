package com.andreamazzon.session2.thisleaves;

/**
 * This class shows some example of the uses of this
 *
 * @author Andrea Mazzon
 *
 */

public class MainLeaf {
	public static void main(String[] args) {
		Leaf x = new Leaf(0);
		x.increment().increment().increment().print(); //iterated calls using this
		Flower daisy = new Flower(); //call to the default constructor: what will it happen?
		daisy.printPetalCountAndString();
	}
}

