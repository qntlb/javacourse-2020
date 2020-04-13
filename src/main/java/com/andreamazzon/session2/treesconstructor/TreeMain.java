package com.andreamazzon.session2.treesconstructor;

/**
 * This class gives a very simple example of the construction of an object through a constructor
 * with arguments (here a double).
 *
 * @author Andrea Mazzon
 */
public class TreeMain {

	static public void main(String[] args) {
		double treeHeight = 3.2;
		Tree myTree = new Tree(treeHeight); //call of the constructor with the double argument
	}
}
