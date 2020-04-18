package com.andreamazzon.session3.simplerprinterexample;

import com.andreamazzon.session3.useful.Print;

/*
 * import static: allows members (fields and methods) which have been "defined" as public static,
 * to be used without specifying the class in which the field has been defined.
 */

/**
 * This class illustrates the way we can import other packages. Main thing to
 * note: through "import static" you can avoid to specify the name of a class for a static
 * method or field.
 *
 * @author: Andrea Mazzon
 */
//import static com.andreamazzon.session3.useful.Print.printn;


/**
 * This class uses a method of a class of an external package
 *
 * @author Andrea Mazzon
 *
 */
public class SimplerPrinterExample {
	public static void main(String[] args) {
		Print.printn("Printing is now much simpler");
	}
}
