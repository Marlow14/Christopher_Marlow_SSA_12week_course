package com.tiy.zoo;

public class Whale extends Aquatic {
	
	private String name = null;
	private int numOfFishEaten = 0;
	
	public Whale(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean breathesAir, String name, int numOfFishEaten) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, breathesAir);
		this.name = name;
		this.numOfFishEaten = numOfFishEaten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfFishEaten() {
		return numOfFishEaten;
	}

	public void setNumOfFishEaten(int numOfFishEaten) {
		this.numOfFishEaten = numOfFishEaten;
	}

	@Override
	public String toString() {
		return "A whale named " + keptInside + " " + name + ", has eaten " + numOfFishEaten + " " + classification + " "
				+ warmBlooded + "ly covered by " + coveredBy + " totalling " + eyes + " " + foodSource + ".";
	}
	
	

}
