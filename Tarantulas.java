package com.tiy.zoo;

public class Tarantulas extends Spiders {

	private boolean isPoisonous = false;

	public Tarantulas(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean bodyDividedInto2, boolean isPoisonous) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, bodyDividedInto2);
		this.isPoisonous = isPoisonous;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	@Override
	public String toString() {
		return "It is " + isPoisonous + " that Tarantulas are poisonous " + classification + ", covered by " + coveredBy
				+ " and have " + eyes + " and eat " + foodSource + ".";
	}

}
