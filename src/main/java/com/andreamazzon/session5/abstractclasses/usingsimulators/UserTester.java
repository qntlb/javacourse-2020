package com.andreamazzon.session5.abstractclasses.usingsimulators;


/**
 * This class tests the features of the class BinomialModelUser, which is an example of the use of
 * composition and delegation.
 *
 * @author Andrea Mazzon
 *
 */
public class UserTester {

	public static void main(String[] args) {
		double initialValue = 100;
		double increaseIfUp = 2;
		double decreaseIfDown = 0.5;
		double interestRate = 0;
		double probabilityStayTheSame = 0.3;

		int seed = 1897;
		int lastTime = 10;
		int numberOfSimulations = 1000000;
		int simulationIndex = 1;

		BinomialModelUser binomialTester = new BinomialModelUser(initialValue, increaseIfUp, decreaseIfDown, interestRate, seed,
				lastTime, numberOfSimulations);

		System.out.println("Path for simulation " + simulationIndex + ":");
		binomialTester.printPath(simulationIndex);

		double finalAverageBinomial = binomialTester.getAverageAtGiveTime(lastTime);

		System.out.println("Average of the binomial model process at time " + lastTime + ": " + finalAverageBinomial);


		TrinomialModelUser trinomialTester =
				new TrinomialModelUser(initialValue, increaseIfUp, decreaseIfDown, interestRate, probabilityStayTheSame, seed,
						lastTime, numberOfSimulations);

		System.out.println("Path for simulation " + simulationIndex + ":");
		trinomialTester.printPath(simulationIndex);

		double finalAverageTrinomial = trinomialTester.getAverageAtGiveTime(lastTime);

		System.out.println("Average of the trinomial model process at time " + lastTime + ": " + finalAverageTrinomial);

	}
}

