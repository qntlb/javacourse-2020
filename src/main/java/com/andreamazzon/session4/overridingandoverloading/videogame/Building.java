package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * Class representing a building. It can get damaged only by objects of type MorePowerfulWarrior
 *
 * @author Andrea Mazzon
 *
 */
public class Building {

	/*
	 * This is the value of health points, when reaches zero the building ceases to exist. Here we give the initial
	 * value, but of course it might change over time.
	 */
	public double healthPoints = 1000;//initial value of the health points.

	Building(){
		System.out.println("New building created");
	}
}
