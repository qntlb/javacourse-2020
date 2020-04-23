package com.andreamazzon.session5.explicitupcasting.goalkeepers;

/**
 * Base class: two fields and one method, which will be inherited from
 * the derived class
 *
 * @author Andrea Mazzon
 *
 */
public class GoalKeeper {

	/*
	 * for our purposes, package access is enough. However, let's make it protected in order to stress
	 * the fact it could be accessed from objects of ModernGoalKeeper even if it was outside the package
	 *
	 */
	protected int age;
	protected double marketValue = 25;//marketValue initialized to 25 in the base class

	GoalKeeper() { //constructor: it will be called by the constructor of the derived class
		System.out.println("My task is to prevent the opponent to score");
	}

	//public: we imagine we want to access from outside as well
	public void save() {
		System.out.println("Save as a classic goal keeper");
	}

}

