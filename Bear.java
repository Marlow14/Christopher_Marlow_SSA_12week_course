package com.tiy.zoo;

public class Bear extends Mammal {

	private String color = null;
	private int picnicBasketsStolen = 0;

	public Bear(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, String type, String color, int picnicBasketsStolen) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, type);
		this.color = color;
		this.picnicBasketsStolen = picnicBasketsStolen;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPicnicBasketsStolen() {
		return picnicBasketsStolen;
	}

	public void setPicnicBasketsStolen(int picnicBasketsStolen) {
		this.picnicBasketsStolen = picnicBasketsStolen;
	}

	@Override
	public String toString() {
		return "The " + color + " " + classification + " bear yoogi covered by " + coveredBy + " stole " + warmBlooded
				+ "ly " + keptInside + " " + picnicBasketsStolen + " picnic baskets" + " from " + foodSource
				+ " he saw with his own " + eyes + " eyes.";
	}

}
