package com.tiy.piglatin;

import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		ArrayList<String> userPigLatinList = new ArrayList<String>();

		String repeat = "";

		do {
			Scanner keyboard = new Scanner(System.in);

			System.out.println("Enter the word to be converted in to Pig Latin:");
			String word = keyboard.nextLine();

			PigLatinConverter plc = new PigLatinConverter();
			System.out.println("Converted to Pig Latin is spoken:");

			String aSuperNewWord = plc.changeNothing(word.toLowerCase());
			userPigLatinList.add(aSuperNewWord);

			System.out.println("Do you want to try another word?\n" + "Enter [y] for yes and [n] for no:");
			repeat = keyboard.next();
			if (repeat.equalsIgnoreCase("n")) {
				System.out.println("Your converted Pig Latin words are:");
				System.out.println(userPigLatinList);
			}

		} while (repeat.equalsIgnoreCase("y"));

	}

}

// public static String word;

// char character;
// char firstLetter = word.charAt(0);
// char secondLetter = word.charAt(1);
// char thirdLetter = word.charAt(2);

// if (firstLetter == 'a' || firstLetter == 'A' || firstLetter ==
// 'e' || firstLetter == 'E' || firstLetter == 'i' || firstLetter ==
// 'I' || firstLetter == 'o'
// || firstLetter == 'O' || firstLetter == 'u' || firstLetter == 'U'
// || firstLetter == 'y' || firstLetter == 'Y')
// {
// System.out.println(word + "-yay");
// }
// else{
// System.out.println(modUserInput.substring(1) + "-"+ firstLetter +
// "ay");
// }

// PigLatinConverter a = new PigLatinConverter();
// a.test();

// a.getUserPigLatinList();