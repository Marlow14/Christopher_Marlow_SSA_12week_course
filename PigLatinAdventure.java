package com.tiy.piglatin;

import java.util.Scanner;
/*
 * 
 * Author
 * */

public class PigLatinAdventure {
	

	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.println("Enter:");
		String word = keyboard.nextLine();
		
	plAdvConverter plc = new plAdvConverter();
		
		plc.wordConverter(word);

	}

	

}
