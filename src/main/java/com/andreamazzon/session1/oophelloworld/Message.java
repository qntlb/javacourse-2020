package com.andreamazzon.session1.oophelloworld;

/**
 * The main use of this class is to print a message. It has one field, messageToBePrinted, and two methods,
 * printMessage() and printMessageWithArgument(String message).
 *
 * @author Andrea Mazzon
 */
public class Message {
	//special Java feature: String can be initialized with quoted text. It can anyway be manipulated from other classes
	//String messageToBePrinted = "a message";
	//or also:
	String messageToBePrinted = new String("Good morning");

	/*
	 * look at the definition of the method: void (it returns no object),name of the method (first letter not capitalised,
	 * Java convention), argument list (in this case no argument)
	 */
	void printMessage() {//this method prints the message contained in the string messageToBePrinted of the object
		System.out.println(messageToBePrinted);
	}

	/*
	 * this method also prints a string: not the one contained in messageToBePrinted, but one string passed through the argument
	 * list. This two methods do the same thing, but in different ways. We will see in some time how to deal with this situation
	 */
	void printMessageWithArgument(String message) {
		System.out.println(message);
	}
}