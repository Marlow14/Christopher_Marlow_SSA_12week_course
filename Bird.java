package com.tiy.zoo;

public class Bird extends Animals {

	private boolean canFly = false;

	public Bird(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean canFly) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource);
		this.canFly = canFly;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	
}
