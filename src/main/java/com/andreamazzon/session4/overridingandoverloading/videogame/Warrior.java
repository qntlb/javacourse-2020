package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * This class will be extended by MorePowerfulWarrior. It has two methods, damage(Warrior warrior)
 * and move(double x, double y). The method move(double x, double y) will be just inherited by the
 * derived class MorePowerfulWarrior, whereas damage(Warrior warrior will be overridden (because more
 * damages and caused) and also overloaded.
 *
 * @author Andrea Mazzon
 *
 */

public class Warrior {

	/*
	 * protected because will be used also by the derived class. Final and static because it is the
	 * same for all objects of type Warrior and it must not change during the game.
	 */
	protected final static double impactOnWarriors = 10;

	/*
	 * This is the value of health points, when reaches zero the warrior dies. Here we give the initial
	 * value, but of course it might change over time.
	 */
	public double healthPoints = 1000;

	Warrior(){
		System.out.println("New warrior created");//constructor
	}

	/**
	 * Causes damages to an enemy.
	 *
	 * @param warrior, the enemy
	 */
	public void damage(Warrior warrior) {
		warrior.healthPoints -= impactOnWarriors;
	}

	/**
	 * Moves the warrior
	 * @param x first coordinate
	 * @param y second coordinate
	 */
	public void move(double x, double y) {
		System.out.println("Warrior moving towards" + x + "," + y);
	}

}

