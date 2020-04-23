package com.andreamazzon.session5.explicitupcasting.goalkeepers;

/**
 * The main method of this class tests what happens in case of upcasting.
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {

	public static void main(String[] args) {

		GoalKeeper buffon = new GoalKeeper();
		buffon.save();
		System.out.println();
		//buffon.playTheBall();//error! this is a method of the derived class only
		ModernGoalKeeper neuer = new ModernGoalKeeper();
		neuer.save();//inherited!
		neuer.playTheBall(); //he can
		System.out.println("Value of non upcasted: " + neuer.marketValue);
		System.out.println();
		/*
		 * upcasting here: we call the constructor of ModernGoalKeeper, but then we give to the created object
		 * a reference of type GoalKeeper: it will see
		 */
		GoalKeeper upcastedModern = new ModernGoalKeeper();
		upcastedModern.save();
		System.out.println("Value of upcasted: " + upcastedModern.marketValue);//value of the field of the base class
		//upcastedModern.playTheBall;//he cannot!
	}

}
