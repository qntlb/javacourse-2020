package com.andreamazzon.session4.overridingandoverloading.videogame;

/**
 * The main method  class shows the difference between overriding and overloading
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Warrior enemyWarrior = new Warrior();

		System.out.println("The enemy has first " + enemyWarrior.healthPoints + " health points");

		warrior.damage(enemyWarrior);

		System.out.println("The enemy has now " + enemyWarrior.healthPoints + " health points");

		MorePowerfulWarrior morePowerfulWarrior = new MorePowerfulWarrior();

		morePowerfulWarrior.damage(enemyWarrior);

		System.out.println("And now, " + enemyWarrior.healthPoints + " health points");

		System.out.println("The more powerful warrior can also damage buildings:");

		Building newBuilding = new Building();

		System.out.println("The building has first " + newBuilding.healthPoints + " health points");

		morePowerfulWarrior.damage(newBuilding);

		System.out.println("And now " + newBuilding.healthPoints + " health points");

	}
}

