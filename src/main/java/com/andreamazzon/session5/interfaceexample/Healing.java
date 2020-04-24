package com.andreamazzon.session5.interfaceexample;

/**
 * This class illustrates how upcasting and polymorphism work also
 * with interfaces. it has a method which takes as an argument an object
 * of any class implementing Cure: the right implementation of the method is
 * called at running time via late binding.
 *
 * @author Andrea Mazzon
 *
 */
public class Healing {

	public static void magicHealing(Cure c) {//object of any class implementing Cure
		c.diagnose();//the right implementation of the method is called at running time
		//c.aDoctorMethod();//it is not a method common to every class implementing Cure
		/*
		 * I can downcast, it does not complain at compilation time. But it's dangerous:
		 * see what happens when I call the method for an of type Antivirus.
		 */
		//((Doctor) c).aDoctorMethod();
	}

	public static void main(String[] args) {
		Antivirus mcAfee = new Antivirus();
		Cure doctorHouse = new Doctor();//explicit upcasting
		magicHealing(doctorHouse);
		magicHealing(mcAfee);//upcasting
		((Doctor) doctorHouse).aDoctorMethod();//downcasting
		//doctorHouse.aDoctorMethod();
	}
}
