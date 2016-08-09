package com.tiy.zoo;

public class Monkey extends Mammal {
	
	private boolean wasInShowBiz = false;
	private int numOfTVShows = 0;
	
	public Monkey(String classification, String coveredBy, boolean keptInside, boolean warmBlooded, int eyes,
			String foodSource, String type, boolean wasInShowBiz, int numOfTVShows) {
		super(classification, coveredBy, keptInside, warmBlooded, eyes, foodSource, type);
		this.wasInShowBiz = wasInShowBiz;
		this.numOfTVShows = numOfTVShows;
	}

	public boolean isWasInShowBiz() {
		return wasInShowBiz;
	}

	public void setWasInShowBiz(boolean wasInShowBiz) {
		this.wasInShowBiz = wasInShowBiz;
	}

	public int getNumOfTVShows() {
		return numOfTVShows;
	}

	public void setNumOfTVShows(int numOfTVShows) {
		this.numOfTVShows = numOfTVShows;
	}

	@Override
	public String toString() {
		return "Was it " + wasInShowBiz + " the monkey was in show biz?" + " He was on " + numOfTVShows + " numbers of shows. " 
				+ classification + " " + coveredBy + " and " + eyes + " eyes " + keptInside + "ly, kept him inside a " + warmBlooded + " a " + foodSource + ".";
	}

	
}
