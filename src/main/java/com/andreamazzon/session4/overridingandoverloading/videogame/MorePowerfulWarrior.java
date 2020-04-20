package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * This class extends Warrior. In particular, it overrides and overload the damage method, see the comments.
 * However, this is not always a good programming practice. It directly inherits the method move(double x, double y) (we want no changes) and the field
 * impactOnWarriors.
 *
 * @author Andrea Mazzon
 *
 */
public class MorePowerfulWarrior extends Warrior {

	private final static double strengthening = 10;//it will cause more damages
	private final static double impactOnBuildings = 5;//new field!


	MorePowerfulWarrior(){
		System.out.println("A more powerful one");//constructor of the derived class. We don't call the super one.
	}

	/**
	 * Causes damages to an enemy. Overridden because it causes more damages than an object of the base class.
	 *
	 * @param warrior, the enemy
	 */
	/*
	 * note the @Override annotation: if we use it, we get an error if our method is not overriding a method
	 * of the parent class. This is useful to avoid mistakes (for example we are accidentally changing the name
	 * of the method)
	 */
	@Override
	public void damage(Warrior warrior) {
		warrior.healthPoints -= (impactOnWarriors + strengthening);
	}

	/**
	 * Causes damages to an building. Overloaded because objects of the derived class can also damage buildings,
	 * i.e., they can "implement the method in a different way".
	 *
	 * @param building, a Building of the enemy
	 */
	public void damage(Building building) {
		building.healthPoints -= impactOnBuildings;
	}
}
