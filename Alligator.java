package com.tiy.zoo;

public class Alligator extends Reptile {
	
	private int numOfTeeth = 0;

	public Alligator(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean hasLegs, int numOfTeeth) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, hasLegs);
		this.numOfTeeth = numOfTeeth;
	}

	public int getNumOfTeeth() {
		return numOfTeeth;
	}

	public void setNumOfTeeth(int numOfTeeth) {
		this.numOfTeeth = numOfTeeth;
	}

	@Override
	public String toString() {
		return "Alligator's have " + numOfTeeth + " number of teeth. " + classification + " was covered by " + coveredBy + " "
				+ keptInside + "ly. " + "And " + eyes + " " + foodSource + " " + warmBlooded + "ly approached and were eaten.";
	}

	
}
