package com.tiy.zoo;

public class Snake extends Reptile {
	
	private boolean hasLegs = false;

	public Snake(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, boolean hasLegs, boolean hasLegs2) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, hasLegs);
		hasLegs = hasLegs2;
	}

	public boolean isHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}

	@Override
	public String toString() {
		return "Snake has " + hasLegs + " legs is " + classification + ", and covered by " + coveredBy
				+ ", while " + keptInside + "ly kept inside " + "because it is " + warmBlooded + "ly, warm blooded and has " + eyes + "eyes,  and a food source of "
				+ foodSource + ".";
	}
	
	
	
	
	

}
