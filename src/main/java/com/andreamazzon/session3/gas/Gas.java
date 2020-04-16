package com.andreamazzon.session3.gas;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class shows the use of encapsulation in order to manage access control: imagine we have an American client
 * who only understands degrees Fahrenheit. However, we work with Kelvin. We have therefore to let him give and read
 * degrees Fahrenheit, through public getters and setters, and then perform a conversion from Fahrenheit to Kelvin,
 * and vice versa. These methods to perform conversions should be private: the client is only interested on Fahrenheit.
 *
 * @author Andrea Mazzon
 *
 */
public class Gas {

	private double temperature; //it should be Kelvin: private, the client does not see it
	private double pressure; //Pascal

	final private double gayLussacConstant=8.3145; //final keyworld: it can not be modified

	private void kelvinToFahreneit(){   //Transformations for outputs
		temperature=temperature*9/5-459.67;
	}

	private void fahrenheitToKelvin(){ //Transformation for inputs
		temperature = (temperature+459.67)*5/9;
	}

	/*
	 * getter of the temperature: the conversion from Kelvin to Fahreneit has to be performed
	 * (we work with Kelvin, the client wants to read Fahreneit)
	 */
	public double getTemperature() {
		kelvinToFahreneit();
		return temperature;
	}

	/*
	 * setter of the temperature: the conversion from Fahreneit to Kelvin has to be performed
	 * (we work with Kelvin, the client wants to set Fahreneit)
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		fahrenheitToKelvin();
		printn("The temperature in Kelvin is now " + this.temperature);
	}

	//Calculates pressure- Gay Lussac Law. The temperature has to be in Kelvin
	private void calculatePressure(){
		pressure=temperature*gayLussacConstant;
	}

	//getter of the pressure: of course public
	public double getPressure() {
		calculatePressure();
		return pressure;
	}
}
