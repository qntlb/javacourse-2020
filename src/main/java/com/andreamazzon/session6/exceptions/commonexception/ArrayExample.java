package com.andreamazzon.session6.exceptions.commonexception;

/**
 * Very easy example of exception, directly given by Java, for an array
 * out of bounds. Note that the error is not handled at compilation time.
 */
public class ArrayExample {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		for (int i = 0; i<12;i++) {
			myArray[i]=i;
		}
	}

}
