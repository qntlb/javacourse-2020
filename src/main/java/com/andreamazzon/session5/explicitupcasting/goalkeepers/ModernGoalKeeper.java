package com.andreamazzon.session5.explicitupcasting.goalkeepers;

/**
 * The class ModernGoalKeeper inherits from GoalKeeper. It has another initialization of the field
 * marketValue, that for objects with a reference of ModernGoalKeeper shadows the one of GoalKeeper,
 * a specific method and an overridden method. This is done in order to see what happens in case of
 * upcasting.
 *
 * @author Andrea Mazzon
 *
 */
public class ModernGoalKeeper extends GoalKeeper {

	//int marketValue = 50;// Try to uncomment it, comment the assignment in the constructor and see what happens in case of upcasting


	ModernGoalKeeper() { //it automatically calls also the constructor of the base class
		System.out.println("But I have also to play the ball");
		/*
		 * higher value. marketValue could be changed even if ModernGoalKeeper was defined outside the
		 * package of GoalKeeper, because it is protected.
		 */
		marketValue = 50;//will be the same for the upcasted one: the constructor of the derived class is called
	}

	@Override
	/*
	 * try to erase "public". Note: the access level in the derived class cannot be more restrictive
	 * than the one in the base class
	 */
	public void save() {
		System.out.println("Save as a modern goal keeper");//overridden version
	}

	public void playTheBall() { // this is a specific method of the derived class
		System.out.println("I make a good pass for my mitfielder");
	}
}



