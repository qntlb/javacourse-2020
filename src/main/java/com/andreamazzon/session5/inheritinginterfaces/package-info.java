/**
 * Scope of this package is to illustrate that, differently from what happens with classes, multiple inheritance
 * is possible for interfaces: an interface can indeed inherit from more than one interfaces. This makes
 * sense, because there are no already implemented methods with possible clashes. We see that a class implementing
 * an interfaces which extends two interfaces must implement:
 * - the methods of the two parent interfaces;
 * - the methods of the derived interface.
 */

package com.andreamazzon.session5.inheritinginterfaces;