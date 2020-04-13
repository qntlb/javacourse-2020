package com.andreamazzon.session1.oophelloworld;


/**
 * This class has a field which is an object of type Message, i.e., an instance of the Message class, in order to print
 * the typical hello world message
 *
 * @author Andrea Mazzon
 */
public class OopHelloWorld {

	public static void main(String[] args) {

		/* Object creation: NameOfClass nameOfObject = new NameOfClass(); Message() is a particular method
		 * called constructor. More about this tomorrow
		 */
		Message myMessage = new Message();
		Message myOtherMessage = new Message(); //these are fields of the class OopHelloWorld
		myMessage.messageToBePrinted = "Here is my message";//see how a field of an object is manipulated
		myOtherMessage.messageToBePrinted = "Other message";

		System.out.println("Hi world! " + myMessage.messageToBePrinted); // see how a field of an object is accessed

		myMessage.printMessage(); //see how a method is called
		myMessage.printMessageWithArgument("Another hallo world");
	}

}
