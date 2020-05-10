package com.andreamazzon.session4.usefulmatrices;

/**
 * This class contains some useful static methods for dealing with matrices and
 * arrays
 *
 * @author Andrea Mazzon
 *
 */
public class UsefulMethodsMatricesVectors {

	// a matrix is an array of arrays

	/**
	 *
	 * @param matrix
	 * @return transpose of matrix
	 */
	public static double[][] getTranspose(double matrix[][]) {
		int columnLength = matrix.length;
		// matrix[0] is the first row of the matrix
		int rowLength = matrix[0].length;// number of columns: length of the row
		double[][] transpose = new double[rowLength][columnLength];

		// double for loop to transpose the matrix
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < columnLength; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
	}

	/**
	 *
	 * @param matrix
	 * @param columnIndex
	 * @return it returns the column of matrix indicated by columnIndex
	 */
	public static double[] getColumn(double[][] matrix, int columnIndex) {
		double[][] transpose = getTranspose(matrix);
		return transpose[columnIndex];// the row of the transpose indicated by columnIndex
	}

	/**
	 *
	 * @param matrix
	 * @param columnIndex
	 * @return it returns the row of matrix indicated by columnIndex
	 */
	public static double[] getRow(double[][] matrix, int rowIndex) {
		return matrix[rowIndex];
	}

	/**
	 *
	 * @param vector
	 * @return the average of vector
	 */
	public static double getAverage(double vector[]) {
		double sum = 0;
		double length = vector.length;
		for (int i = 0; i < length; i++) {
			sum += vector[i];
		}
		return sum / length;
	}

	/**
	 * It computes the standard deviation of a vector given as an argument
	 *
	 * @param vector
	 * @return standard deviation of the vector
	 */
	public static double getStandardDeviation(double[] vector) {
		double standardDeviation = 0.0;
		double average = getAverage(vector);
		for (double element : vector) { // foreach syntax
			standardDeviation += (element - average) * (element - average);
		}
		return Math.sqrt(standardDeviation / (vector.length - 1)); // Notice the -1 !
	}

	/**
	 * it prints the entries of vector
	 *
	 * @param vector
	 */
	public static void printVector(double[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

	/**
	 * It returns the biggest element of a one-dimensional array of doubles
	 *
	 * @param vector the one-dimensional array
	 * @return the biggest element of the one-dimensional array
	 */
	public static double getMin(double[] vector) {
		double min = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
			}
		}
		return min;
	}

	/**
	 * It returns the biggest element of a one-dimensional array of doubles
	 *
	 * @param vector the one-dimensional array
	 * @return the biggest element of the one-dimensional array
	 */
	public static double getMax(double[] vector) {
		double max = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
			}
		}
		return max;
	}

	/**
	 * It returns an array of integers which represent the number of realizations of
	 * a given array that lie in every subinterval (bin) of an interval [minBin,
	 * maxBin]. All the subintervals are of equal length. The first entry of the
	 * integer array represent the number of realizations strictly smaller then
	 * minBin, the last one the number of realizations bigger than maxBin.
	 *
	 * @param realisations
	 * @param minBin
	 * @param maxBin
	 * @param binsNumber,  number of the subintervals
	 * @return array of integers
	 */
	public static int[] buildHistogram(double[] realizations, double minBin, double maxBin, int binsNumber) {
		int[] bins = new int[binsNumber + 2];// two more because of outliers
		double binSize = (maxBin - minBin) / binsNumber; // every bin has the same length
		for (double realization : realizations) {
			if (realization < minBin) { // it goes in the first bin
				bins[0] += 1;
			} else if (realization > maxBin) {
				bins[binsNumber + 1] += 1; // it goes in the last bin
			} else {
				int intRatio = (int) ((realization - minBin) / binSize);
				/*
				 * bin[i+1] (remember: in Java the first entry is 0, and here bin[0] hosts the
				 * realization smaller than min) hosts the realization such that (realization -
				 * minBin) / binSize is in [i,i+1)
				 */
				bins[intRatio + 1] += 1;
			}
		}
		return bins;
	}

	/**
	 * It returns a vector whose values are the absolute values of a vector given as
	 * an argument
	 * 
	 * @param array, array of doubles
	 * @return array of absolute value of the array
	 */
	public static double[] absVector(double[] vector) {
		double[] absVector = new double[vector.length];
		for (int i = 0; i < vector.length; i++) {
			absVector[i] = Math.abs(vector[i]);
		}
		return absVector;
	}

	/**
	 * it returns the sum of two vectors
	 * 
	 * @param firstArray
	 * @param secondVector
	 * @return sum of the vectors
	 * @throws DifferentLengthException: if the vectors have not the same length
	 */
	public static double[] sumVectors(double[] firstVector, double[] secondVector) throws DifferentLengthException {
		int firstLength = firstVector.length;
		int secondLength = secondVector.length;

		if (firstLength != secondLength) {
			// we throw an exception if the two vectors have not the same length
			throw new DifferentLengthException();
		}
		double[] sum = new double[firstLength];
		for (int i = 0; i < firstLength; i++) {
			sum[i] = firstVector[i] + secondVector[i];
		}
		return sum;
	}

	/**
	 * it returns the difference of two vectors
	 * 
	 * @param firstVector
	 * @param secondVector
	 * @return difference of the vectors
	 * @throws DifferentLengthException: if the vectors have not the same length
	 */
	public static double[] differenceVectors(double[] firstVector, double[] secondVector)
			throws DifferentLengthException {
		int firstLength = firstVector.length;
		int secondLength = secondVector.length;

		if (firstLength != secondLength) {
			// we throw an exception if the two vectors have not the same length
			throw new DifferentLengthException();
		}
		double[] difference = new double[firstLength];
		for (int i = 0; i < firstLength; i++) {
			difference[i] = firstVector[i] - secondVector[i];
		}
		return difference;
	}

	/**
	 * It returns a vector whose elements are the product of the elements of two
	 * vectors
	 * 
	 * @param firstVector
	 * @param secondVector
	 * @return vector whose elements are the product of the elements of two vectors
	 * @throws DifferentLengthException: if the vectors have not the same length
	 */
	public static double[] productVectors(double[] firstVector, double[] secondVector) throws DifferentLengthException {
		int firstLength = firstVector.length;
		int secondLength = secondVector.length;
		if (firstLength != secondLength) {
			// we throw an exception if the two vectors have not the same length
			throw new DifferentLengthException();
		}
		double[] product = new double[firstLength];
		for (int i = 0; i < firstLength; i++) {
			product[i] = firstVector[i] * secondVector[i];
		}
		return product;
	}

	/**
	 * It returns a vector whose elements are the ratio of the elements of two
	 * vectors
	 * 
	 * @param firstVector
	 * @param secondVector
	 * @return vector whose elements are the ratio of the elements of two vectors
	 * @throws DifferentLengthException: if the vectors have not the same length
	 */
	public static double[] ratioVectors(double[] firstVector, double[] secondVector) throws DifferentLengthException {
		int firstLength = firstVector.length;
		int secondLength = secondVector.length;
		if (firstLength != secondLength) {
			// we throw an exception if the two vectors have not the same length
			throw new DifferentLengthException();
		}
		double[] ratio = new double[firstLength];
		for (int i = 0; i < firstLength; i++) {
			ratio[i] = firstVector[i] / secondVector[i];
		}
		return ratio;
	}
}
