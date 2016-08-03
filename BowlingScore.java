package com.tiy.day_three_assignment;

public class BowlingScore {

	public static int frame(int pins) {

		return 0;

	}

	public static void main(String[] args) {

		int frames = 10;
		int pins = 11;

		int frameScore = 0;

		int gameScore = 0;

		for (int i = 0; i < frames; i++) {

			for (int j = 0; j < frames; j++) {
				int throw1;
				int throw2 = 0;
				throw1 = (int) (Math.random() * pins);
				if (throw1 < 10) {
					throw2 = (int) (Math.random() * (pins - throw1));
				} else {
					throw1 = 10;
				}
				
				if (throw1 < 10)
				frameScore = throw1 + throw2;
				
				
				System.out.println("Throw 1 = " + throw1);
				System.out.println("Throw 2 = " + throw2);
				
				System.out.println("Frame score = " + frameScore);
				System.out.println("");

			}

			gameScore += frameScore;
			System.out.println("Final Score = " + gameScore);
		}
	}

}
