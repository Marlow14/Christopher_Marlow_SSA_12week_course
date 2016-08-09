package com.tiy.zoo;

public class Shark extends Aquatic {
	
	private int numOfHumanKills = 0;

	public Shark(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean breathesAir, int numOfHumanKills) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, breathesAir);
		this.numOfHumanKills = numOfHumanKills;
	}

	public int getNumOfHumanKills() {
		return numOfHumanKills;
	}

	public void setNumOfHumanKills(int numOfHumanKills) {
		this.numOfHumanKills = numOfHumanKills;
	}

	@Override
	public String toString() {
		return "Sharks kill " + numOfHumanKills + " " + classification.toLowerCase() + "'s, costing " + warmBlooded + " "
				+ coveredBy + " to " + eyes + " " + keptInside + " " + foodSource + ".";
	}
	
	
}
