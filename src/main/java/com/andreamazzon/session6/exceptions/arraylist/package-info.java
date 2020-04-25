/**
 * The class Divider has a static void Divide method which serves as an example of how exceptions are
 * handled and thrown: you start by dividing a double firstDividend by a double Divisor. If Divisor
 * is zero, you get an exception: we indeed create a class DivideByZeroException, extending Exception,
 * with a method print() which prints a message saying that you are dividing by zero (see the syntax in
 * this class). Otherwise,  you get the result and divide it by Divisor and so on,
 * until you reach a number smaller then minResult (and you get an UnderFlowException, also defined as a
 * class extending Exception) or bigger then maxResult (and you get an OverFlowException, again, a class
 * defined in this package extending Exception). Have a look at ExcpetionChecker in order to see the syntax you
 * use when calling a method that can throw one or more exceptions.
 *
 */
package com.andreamazzon.session6.exceptions.arraylist;