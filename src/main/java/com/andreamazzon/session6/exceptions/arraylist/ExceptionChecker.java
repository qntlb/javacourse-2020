package com.andreamazzon.session6.exceptions.arraylist;

public class ExceptionChecker {

	public static void main(String[] args) {

		//Divider.divide(1.0, 0.1, 0.01, 1000);//you cannot call it in this way, because of possible exceptions

		//the code by which exceptions can derive is surrounded by brackets, after "try"
		try {
			Divider.divide(1.0, 1.001, 0.01, 1000);
		}
		//list of the possible exceptions: you have to list them all or throw the missing exception.
		catch (UnderFlowException exception) {
			exception.print();
		}
		catch (OverFlowException exception) {
			exception.print();
		}
		catch (DivideByZeroException exception) {
			exception.print();
		}
	}
}
