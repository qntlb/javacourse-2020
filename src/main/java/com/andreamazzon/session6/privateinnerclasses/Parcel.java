package com.andreamazzon.session6.privateinnerclasses;

public class Parcel {
	private class PContents implements Contents {
		private int i = 11;
		@Override
		public int value() { return i; }
	}
	protected class PDestination implements Destination {
		private String label;
		private PDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() { return label; }
	}
	public Destination dest(String s) {
		return new PDestination(s);
	}
	public Contents cont() {
		return new PContents();
	}
}