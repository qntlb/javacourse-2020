package com.andreamazzon.session1.elevator;

/**
 * This class gives a very simple example of for loop, where the stepping reduces the number by one
 *
 * @author Andrea Mazzon
 */
public class Elevator {

	public static void main(String[] args) {
		for (int floor = 10 /*initialization*/; floor > 0 /*Boolean expression*/; floor -- /*step*/) {
			System.out.println("The elevator is at floor number " + floor);
		}
		System.out.println("The elevator is at ground level");

		//you could also write:
		int i = 10;
		while(i>0) {
			int a = 1;//it will be cleared after the while cycle
			System.out.println("The elevator is at floor number " + i);
			i --;
		}
		/*
		 * but in this way, i is not deleted after the end of the while. If you create a variable
		 * INSIDE the while, it gets delated after the while.
		 *
		 */
	}
}