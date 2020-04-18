package com.andreamazzon.session3.otherpackage;

import static com.andreamazzon.session3.useful.Print.print;

//importing the classes needed
import com.andreamazzon.session3.accesslevels.Access;
//import com.andreamazzon.session3.accesslevels.PackageAccessOnly;
/**
 * This class shows the difference between package access and public access: we try to call methods of the class
 * com.andreamazzon.session3.accesslevels.Access() and see what happens
 */
public class AccessTestOutside {

	public static void main(String[] args) {
		Access access = new Access();
		//access.packageAccessMethod(); // this method has package access! it is not possible to call it from here
		access.publicMethod();
		//print(access.packageAccessField); // this field has package access! it is not possible to access it from here
		print(access.publicField);
		//this class has package access! it is not possible to construct new objects of the class from here
		//PackageAccessOnly packageAccessOnly= new PackageAccessOnly();
	}

}
