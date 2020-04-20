package com.andreamazzon.session4.inheritance.goalkeepers;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Base class: two fields and one method, which will be inherited from the derived class
 *
 * @author Andrea Mazzon
 *
 */
public class GoalKeeper {

	protected int age;
	protected double marketValue;

	GoalKeeper() { //constructor: it will be called by the constructor of the derived class
		printn("My task is to prevent the opponent to score");
	}

	protected void save() {//this method will be inherited from the derived class
		printn("You will not score");
	}

}
