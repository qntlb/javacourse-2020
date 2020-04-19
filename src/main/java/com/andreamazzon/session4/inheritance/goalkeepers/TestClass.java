package com.andreamazzon.session4.inheritance.goalkeepers;

/**
 * The main method of this class illustrates the basic features of inheritance
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {
	public static void main(String[] args) {

		GoalKeeper buffon = new GoalKeeper();
		buffon.save();
		//buffon.playTheBall();//error! this is a method of the derived class only
		ModernGoalKeeper neuer = new ModernGoalKeeper();
		neuer.save();
		neuer.playTheBall(); //he can
	}
}
