package com.tiy.zoo;

public class Mammal extends Animals {
	
	private String type = null;

	public Mammal(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, String type) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
