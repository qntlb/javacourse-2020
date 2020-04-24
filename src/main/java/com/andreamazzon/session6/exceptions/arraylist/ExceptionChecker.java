package com.andreamazzon.session6.exceptions.arraylist;

public class ExceptionChecker {

	public static void main(String[] args) {

		//Divider.divide(1.0, 0.1, 0.01, 1000);

		//the code by which exceptions can derive
		try {
			Divider.divide(1.0, 1.001, 0.01, 1000);
		} catch (UnderFlowException exception) {
			exception.print();
		} catch (OverFlowException exception) {
			exception.print();
		}
		catch (DivideByZeroException exception) {
			exception.print();
		}
	}
}
