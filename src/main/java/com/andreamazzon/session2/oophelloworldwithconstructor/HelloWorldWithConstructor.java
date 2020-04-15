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
		/*
		 * Object creation. Message() is a particular method called constructor. Since we have defined and
		 * implemented it, it will call "our" default constructor (look at what is going to be printed)
		 */
		MessageWithConstructor myMessage = new MessageWithConstructor();
		myMessage.messageToBePrinted = "Good morning!";//see how a field of an object is manipulated
		myMessage.printMessage(); //see how a method is called

		MessageWithConstructor myOtherMessage = new MessageWithConstructor();
		myOtherMessage.printMessageWithArgument("Good evening!");
	}

}
