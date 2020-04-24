/**
 * In this package we illustrate the meaning of an interface with package access:
 * we have an interface PackageAccessInterface, which has only package access. It is implemented by a class
 * ImplementingClass, which is instead public. Outside this package, it is then possible to create objects
 * of ImplementingClass, but not import and use PackageAccessInterface. The objects of ImplementingClass
 * can call the method defined in PackageAccessInterface because it is automatically public.
 * See the code in com.andreamazzon.session5.otherpackage.
 *
 */
package com.andreamazzon.session5.packageaccessinterfaces;