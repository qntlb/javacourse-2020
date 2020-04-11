package com.andreamazzon.session2.bicycles;

/**
 * This class serves as an example of a possible use of static fields: here we want to know the total cost of
 * our bykes' production. Thus we need a number whose value "passes from an object to the other": a possible
 * solution is to have a field whose value is shared by all of this class, that means, allocated in the same
 * space of memory. This is what we get with a static field.
 *
 * @author Andrea Mazzon
 *
 */
public class Bicycle {

	static double costSum = 0; //static: shared by all the objects. First equal to zero, for the first object.
	int gearsNumber;//this field is not meant to be static: it is must be able to vary for every bike
	String color; //not static, for the same reason
	double cost; //same thing


	//constructor
	Bicycle(int gearsNumber, double cost, String color){
		this.color = color; //note the use of this
		this.gearsNumber = gearsNumber; //note the use of this
		this.cost = cost;

		costSum += cost; //the field is incremented, and will be the same for every Bycicle object
		//or costSum = costSum + cost;
		System.out.println("This is a " + color + " bycicle, with " + gearsNumber + " gears. It costs us " + cost + " euros ");;
		System.out.println("Total cost: " + costSum);
		System.out.println();
		if (costSum > 10000) {
			//we want to known when we have exceeded the total cost of the bikes
			System.out.println("Enough, no more money!");
			/*
			 * we will see maybe on Friday how to prevent the user to construct more objects of this type
			 * (for now we can just warn him)
			 */
		}
	}


}
