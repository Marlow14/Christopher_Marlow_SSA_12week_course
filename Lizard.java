package com.tiy.zoo;

public class Lizard extends Reptile {
	
	private String name = null;

	public Lizard(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean hasLegs, String name) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, hasLegs);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name.toUpperCase() + " the lizard is a " + classification + " lizard, covered by " + coveredBy
				+ ". It is " + keptInside +  " his " + eyes + " " + warmBlooded + " eyes found "
				+ foodSource + ".";
	}
	
	

}
