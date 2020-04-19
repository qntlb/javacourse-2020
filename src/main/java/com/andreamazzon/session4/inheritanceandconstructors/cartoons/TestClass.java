package com.andreamazzon.session4.inheritanceandconstructors.cartoons;

/**
 * This class tests how inheritance works when the base class has more than one constructor.
 * Note which constructors are called.
 *
 * @author Andrea Mazzon
 *
 */

public class TestClass{

	public static void main(String[] args) {

		Drawing simpleDraw = new Drawing("aDraw");//just call the constructor of the base class
		Cartoon goofy= new Cartoon("Goofy");
		Cartoon mickeyMouse= new Cartoon("Mickey Mouse", " Donald Duck");

	}
}