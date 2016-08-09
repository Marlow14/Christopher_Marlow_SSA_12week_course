package com.tiy.zoo;

public class Penguin extends Bird {
	
	private String color = null;

	public Penguin(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean canFly, String color) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, canFly);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "The " + color + " penguin on the " + classification.toLowerCase() + " is covered by " + coveredBy
				+ " which is " + keptInside + " because warm blooded " + eyes + " " + warmBlooded + " eyed " + foodSource
				+ " dry fast.";
	}

	
}
