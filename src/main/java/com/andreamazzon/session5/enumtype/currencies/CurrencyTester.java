package com.andreamazzon.session5.enumtype.currencies;

/**
 * This class contains just a main method that illustrates some uses of enum types
 *
 * @author Andrea Mazzon
 *
 */
public class CurrencyTester {
	public static void main(String[] args) {
		DescribeCurrency currencyDescribe = new DescribeCurrency();
		/*
		 * you refer to a value of an enum type like to a static field of a class:
		 * NameOfTheEnumType.NAMEOFTHEVALUE
		 */
		currencyDescribe.setDescribedCurrency(Currency.DOLLAR);
		currencyDescribe.describe();

		/*
		 * values() is a method of enum types that produces the array of all the values of the enum constant
		 * We go through that array in the for loop.
		 */
		Currency[] currencyValues = Currency.values();
		for (Currency currency : currencyValues) {
			currencyDescribe.setDescribedCurrency(currency);
			currencyDescribe.describe();
		}
	}
}