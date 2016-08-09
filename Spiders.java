package com.tiy.zoo;

public class Spiders extends Animals {
	
	private boolean bodyDividedInto2 = false;

	public Spiders(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean bodyDividedInto2) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource);
		this.bodyDividedInto2 = bodyDividedInto2;
	}

	public boolean isBodyDividedInto2() {
		return bodyDividedInto2;
	}

	public void setBodyDividedInto2(boolean bodyDividedInto2) {
		this.bodyDividedInto2 = bodyDividedInto2;
	}

	
}
