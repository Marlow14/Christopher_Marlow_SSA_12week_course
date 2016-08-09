package com.tiy.baseball;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.tiy.baseball.*;

public class EnterBaseballResults {

	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> batResults = null;

		ArrayList<Integer> batters = null;

		// EnterBaseballResults ebbr = new EnterBaseballResults();
		BaseballCalculator bc = new BaseballCalculator();

		// batters = storeBatters(batters);

		batResults = storeInputs(batResults);

		bc.battingAverage(batResults);
		bc.sluggingPercentage(batResults);

	}

	// public static ArrayList<Integer> storeBatters(ArrayList<Integer> batters)
	// {
	//
	// int noOfBatters = 0;
	//
	// System.out.println("Enter the total number of batters:");
	//
	// noOfBatters = keyboard.nextInt();
	//
	// for (int i = 0; i < noOfBatters; i++) {
	//
	// }
	//
	// return batters;
	// }

	public static ArrayList<Integer> storeInputs(ArrayList<Integer> batResults) {

		batResults = new ArrayList<>();

		int noOfAtBats;
		int number;
		boolean valid = true;

		do {

			System.out.println("To calculate batting average and slugging percentage\n"
					+ "enter the number of total times you batted:");
			noOfAtBats = keyboard.nextInt();

			if (noOfAtBats > 0) {

				valid = true;

				for (int i = 0; i < noOfAtBats; i++) {

					System.out.println("Enter bat result number " + (i + 1) + ":");
					batResults.add(keyboard.nextInt());
					
					if ((batResults.get(i) >= 0) && (batResults.get(i) <= 4)) {
						valid = true;
						
					}else{
						i--;
					}
				}
			} else {

				System.out.println("Invalid!");
				valid = false;
			}
		} while (!(valid));

		return batResults;
	}

}
