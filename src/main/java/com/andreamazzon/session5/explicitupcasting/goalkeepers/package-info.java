/**
 * The code in this package is meant to give a further insight on the upcasting of an object of an inherited class
 * giving it a reference to an object of the base class. For now we have seen implicit upcasting,
 * see for example the RandomShapeGenerator example when the created objects of type Square, Circle or
 * Triangle were upcasted in the returning type of nextShape(). Now we see more in details the effects of
 * upcasting by explicitly giving a reference of the base class to an object created with the constructor
 * of the derived class. In this case we see that:
 * 1. it cannot call methods that are specific of the derived class;
 * 2. when calling a method which is overridden in the derived class, the overridden version
 * is called: we have seen it in the polymorphism examples (the methods specific of Frog or of Circle were
 * called).
 * 3. The specific fields of the derived class cannot be seen. This means that if the same field is
 * initialized in another way in the derived class (not inside the constructor) the value of the
 * base class is assigned.
 *
 * @author Andrea Mazzon
 *
 */
package com.andreamazzon.session5.explicitupcasting.goalkeepers;