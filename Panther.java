package com.tiy.zoo;

public class Panther extends Mammal {
	
	private int topSpeed = 0;
	private String color = null;
	private boolean sellsInsulation = false;
	
	public Panther(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, String type, int topSpeed, String color, boolean sellsInsulation) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, type);
		this.topSpeed = topSpeed;
		this.color = color;
		this.sellsInsulation = sellsInsulation;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSellsInsulation() {
		return sellsInsulation;
	}

	public void setSellsInsulation(boolean sellsInsulation) {
		this.sellsInsulation = sellsInsulation;
	}

	@Override
	public String toString() {
		return "The top speed of " + color + " is " + topSpeed + " rooms a day and it is " + sellsInsulation +" that he sells insulation "
				+ "and is from the " + classification + " family. It is also " + keptInside + " he is covered by " + coveredBy + " and kept inside. " 
				+ "Also he is " + warmBlooded + " he is warm blooded" + " with " + eyes + " eyes " + "and a food source of " + foodSource + ".";
	}
	
	

}
