package com.tiy.zoo;

public class Reptile extends Animals {
	
	private boolean hasLegs = false;

	public Reptile(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean hasLegs) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource);
		this.hasLegs = hasLegs;
	}

	public boolean isHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}

	
}
