package com.tiy.zoo;

public class Aquatic extends Animals {
	
	private boolean breathesAir = false;

	public Aquatic(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean breathesAir) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource);
		this.breathesAir = breathesAir;
	}

	public boolean isBreathesAir() {
		return breathesAir;
	}

	public void setBreathesAir(boolean breathesAir) {
		this.breathesAir = breathesAir;
	}
	

}
