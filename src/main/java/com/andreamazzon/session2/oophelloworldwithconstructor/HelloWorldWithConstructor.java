package com.andreamazzon.session2.oophelloworldwithconstructor;

/**
 * This class has a field which is an object of type MessageWithConstructor, i.e., an instance of the
 * MessageWithConstructor class, in order to print the typical hello world message. The default constructor of
 * MessageWithConstructor is called.
 *
 * @author Andrea Mazzon
 */
public class HelloWorldWithConstructor {

	public static void main(String[] args) {
		MessageWithConstructor myMessage = new MessageWithConstructor(); // Object creation. Message() is a particular method called constructor. More about this later on
		MessageWithConstructor myOtherMessage = new MessageWithConstructor(); //these are fields of the class OopHelloWorld
		myMessage.messageToBePrinted = "Here is my message";//see how a field of an object is manipulated
		myOtherMessage.messageToBePrinted = "Other message";

		System.out.println("Hi world! " + myMessage.messageToBePrinted); // see how a field of an object is accessed

		myMessage.printMessage(); //see how a method is called
		myMessage.printMessageWithArgument("Another hallo world");
	}

}
