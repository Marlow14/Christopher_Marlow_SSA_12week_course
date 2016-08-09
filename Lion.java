package com.tiy.zoo;

public class Lion extends Mammal {
	
	private String location = null;
	private boolean packHunter = false;
	
	public Lion(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, String type, String location, boolean packHunter) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, type);
		this.location = location;
		this.packHunter = packHunter;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isPackHunter() {
		return packHunter;
	}

	public void setPackHunter(boolean packHunter) {
		this.packHunter = packHunter;
	}

	@Override
	public String toString() {
		return "The " + location + " Lion" + " is a " + packHunter + " big " + classification + " pack hunter " +  "covered by " + coveredBy + ". It is " 
	+ keptInside + " that this animal is kept inside but " + warmBlooded + " that it is warm blooded with "
				+ eyes + " eyes, and a foodSource of " + foodSource + ".";
	}

	
}
