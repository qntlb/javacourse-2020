/**
 * Here we have one more example on the use of inner classes. In particular, the inner class
 * SequenceSelector of Sequence implements the interface Selector. A reference to this subclass
 * is returned by the method  getSequenceSelector() of Sequence. In this way, the user only sees
 * the methods of Selector implemented by SequenceSelector, and not the class itself, because it is private.
 * Note that private classes only make sense if they are inner classes. Otherwise objects of such classes
 * cannot be created.
 */
package com.andreamazzon.session6.innerclasses.privateinnerclasses;