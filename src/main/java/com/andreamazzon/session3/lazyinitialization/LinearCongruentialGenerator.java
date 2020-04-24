package com.andreamazzon.session3.lazyinitialization;

/**
 * This class generates pseudo random numbers through a linear congruential random number generator: as you will see,
 * a linear congruential random number generator produces natural numbers
 *
 * x[i+1] =(a*x[i] +c) mod_m,
 *
 * where x[0] = seed, for appropriate values of natural numbers a, c and m (for big m). You will see that it is not
 * optimal because the numbers exhibit serial correlation, but it's not the main point now. This is indeed an example
 * to show the so called "lazy initialization", again by making some methods and fields of the class private.
 *
 * We have a method generate() which generates all the sequence (i.e., an array), up to the number of pseudo random
 * integers we want to simulate.
 * We also have two public methods, getRandomNumberSequence( and getNextInteger(), that return all the sequence and the
 * next integer x[count + 1], where count gets incremented by 1 every time the method is called, respectively.
 * We want that the sequence is generated for the first time only when one of these methods is called by the user: this is called
 * "lazy initialization". Moreover, of course we don't want all the sequence to be generated again every time the
 * user calls one of the methods. We then check if it has been already initialized. In order to do that, the best practice is to make
 * generate() private, as well as the sequence itself.
 *
 * Another thing you see for the first time is the primitive data type long, which expresses an integer number as int
 * does but whose values have an higher range: it ranges in [-2^63, 2^63-1], whereas int in [-2^31,2^31-1]
 *
 * @author Andrea Mazzon
 *
 */
public class LinearCongruentialGenerator {

	//note: all the fields are private!
	private long[] randomNumbers;//array of long
	private final long modulus = (long) Math.pow(2,48); //upcasting necessary, the result of Math.pow(2, 48) is understood as an int
	private final long a = 25214903917L; //if I don't put L after the number, it will complain that is out of range
	private final long c = 11;//automatic upcasting
	private long seed; // it will be the first entry of our pseudo random number list
	private int numberOfPseudoRandomNumbers;//default value
	private int count = 1;

	// constructor
	public LinearCongruentialGenerator(int numberOfPseudoRandomNumbers, long seed) {
		this.numberOfPseudoRandomNumbers = numberOfPseudoRandomNumbers;
		this.seed = seed;
	}

	/*
	 * it generates the sequence of pseudo random numbers. It is void because the sequence is stored in the array,
	 * which is the field of the class. Private because it also gets called internally!
	 */
	private void generate() {
		randomNumbers = new long[numberOfPseudoRandomNumbers + 1];//initialization! + 1 because the first one is the seed
		randomNumbers[0] = seed; // the first entry is the seed: first number of the sequence
		for (int indexOfInteger = 0; indexOfInteger < numberOfPseudoRandomNumbers; indexOfInteger++) {
			long congruence = ((a * randomNumbers[indexOfInteger] + c) % modulus);
			//congruence > -modulus
			if (congruence < 0) {
				congruence += modulus;//otherwise we would get a negative number, because of possible overflows
			}
			randomNumbers[indexOfInteger + 1] = congruence;
		}
	}

	/**
	 * getter method for the sequence of pseudo random natural numbers
	 *
	 * @return the sequence of pseudo random numbers
	 */
	public long[] getRandomNumberSequence() {
		// lazy initialization: the pseudo random sequence is generated only the first time one of two methods is called.
		if (randomNumbers == null) {
			generate();
			return randomNumbers;
		}
		return randomNumbers; // returns the already generated sequence of numbers.
	}

	/**
	 * getter method for the sequence of pseudo random numbers
	 *
	 * @return the next number of the sequence of pseudo random numbers
	 */
	public long getNextInteger() {
		long[] sequence = getRandomNumberSequence();//it gets really generated only once
		return sequence[count++];
	}

	/**
	 * getter method for the modulus
	 *
	 * @return the modulus of the congruence that generates the pseudo random numbers
	 */
	public long getModulus() {
		return modulus;
	}

	/**
	 * getter method for the length of the simulated sequence
	 *
	 * @return the length of the simulated sequence
	 */
	public int getNumberOfPseudoRandomNumbers() {
		return numberOfPseudoRandomNumbers;
	}
}
