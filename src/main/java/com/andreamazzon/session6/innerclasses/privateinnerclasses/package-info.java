/**
 * Here we have one more example on the use of inner classes. In particular, the inner class
 * SequenceSelector of Sequence implements the interface Selector. A reference to this subclass
 * is returned by the method  getSequenceSelector() of Sequence. In this way, the user only sees
 * the methods of Selector implemented by SequenceSelector, and not the class itself (since it is private)
 */
package com.andreamazzon.session6.innerclasses.privateinnerclasses;