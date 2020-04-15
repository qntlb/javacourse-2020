package com.andreamazzon.session2.constructortemperature;

/**
 * This class is an example of use of overloaded constructor: we here create object of the same class
 * first with the overloaded constructor, then with default constructor.
 *
 * @author Andrea Mazzon
 */
public class TemperatureMeasures {

	static public void main(String[] args) {
		Temperature t1 = new Temperature(27.1);//overloaded constructor: we specify the value of the temperature
		System.out.println("The temperature is " + t1.temperature);//remember: to way to access the fields of an object

		Temperature t2 = new Temperature(18.5);
		System.out.println("The temperature is " + t2.temperature);

		Temperature t3 = new Temperature();//overloaded constructor: the value of the temperature is left equal to 0
		System.out.println("The temperature is " + t3.temperature);
	}

}
