package com.andreamazzon.session6.privateinnerclasses;

public class TestParcel {
	public static void main(String[] args) {
		Parcel p = new Parcel();
		Contents c = p.cont();
		Destination d = p.dest("Tanzania");
		System.out.println(d.readLabel());
		System.out.println(c.value());
		// Illegal -- can't access private class:
		//! Parcel3.PContents pc = p.new PContents();
	}
}
