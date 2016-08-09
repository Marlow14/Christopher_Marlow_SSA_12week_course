package com.tiy.zoo;

public class Animals {

	protected String classification = null;
	protected String coveredBy = null;
	protected boolean keptInside = false;
	protected boolean warmBlooded = false;
	protected int eyes = 0;
	protected String foodSource = null;

	public Animals(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource) {
		this.classification = classification;
		this.coveredBy = coveredBy;
		this.keptInside = keptInside;
		this.warmBlooded = warmBlooded;
		this.eyes = eyes;
		this.foodSource = foodSource;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getCoveredBy() {
		return coveredBy;
	}

	public void setCoveredBy(String coveredBy) {
		this.coveredBy = coveredBy;
	}

	public boolean isKeptInside() {
		return keptInside;
	}

	public void setKeptInside(boolean keptInside) {
		this.keptInside = keptInside;
	}

	public boolean isWarmBlooded() {
		return warmBlooded;
	}

	public void setWarmBlooded(boolean warmBlooded) {
		this.warmBlooded = warmBlooded;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getFoodSource() {
		return foodSource;
	}

	public void setFoodSource(String foodSource) {
		this.foodSource = foodSource;
	}
	
	

}
