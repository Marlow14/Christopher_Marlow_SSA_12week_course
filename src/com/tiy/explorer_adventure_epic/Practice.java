package com.tiy.explorer_adventure_epic;

import java.text.SimpleDateFormat;

public class Practice {

	public static void main(String[] args) {

		String hw = "Hello World";

		int num = 1492;

		boolean dogAtHome = true;

		// SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd");
		// Date date = fmt.parse("2016-08-02");
		String date2 = "2016/08/02";

		double money = 5.45;

		char letter = 'X';

		System.out.println(hw);
		System.out.println("Cloumbus Sailed the world in" + num);
		if (!dogAtHome)
			System.out.println("It is true that I have a dog at home");
		System.out.println("Today is " + date2);
		System.out.println("I spent " + money + " on a cheeseburger.");
		System.out.println(letter + "marks the spot");

		String[] movies = { "Training Day", "Man on Fire", "My Blue Heaven", "Miami Vice", "The Martian",
				"The Godfather Trilogy", "Fast and the Furious Series", "The Secret Life of Pets", "Star Trek Series",
				"Friday Series" };
		String[] musicArtist = { "Nas", "JayZ", "Anthony Hamilton", "Donnell Jones", "Mary J Blige", "Eminem",
				"Musiq Soulchild", "Bone Thugs N Harmony", "Snoop Dog", "Lil Kim" };

		for(int i=0; i<movies.length;i++)
			System.out.println(movies[i]);
		
		for(int i=0; i<musicArtist.length;i++)
			System.out.println(musicArtist[i]);
		
		
		String[][] entertainment = new String[4][3];
		entertainment[0][0] = "a";
		entertainment[0][1] = "b";
		entertainment[0][2] = "c";
		
		entertainment[1][0] = "d";
		entertainment[1][1] = "e";
		entertainment[1][2] = "f";
		
		entertainment[2][0] = "g";
		entertainment[2][1] = "h";
		entertainment[2][2] = "i";
		
		entertainment[3][0] = "j";
		entertainment[3][1] = "k";
		entertainment[3][2] = "l";
		
		for(int i=0; i<4;i++){
			for(int j=0; j<3;j++){
				System.out.print(entertainment[i][j]+ "\t");
			}
			System.out.println("");
		}
		
	}

	public void addingMachine(int num) {

	}

	private String carMaker(String make, String model) {
		return this.carMaker("Honda", "Accord");
	}

	public int counter(int count) {
		System.out.println("count");
		if (count <= 0) {
			System.out.println("Done");
		} else {
			counter(count - 1);
		}
		return 0;
	}

	boolean canWeGoHome = true;

	public boolean canWeGoHome(boolean iAmReady) {

		if (iAmReady)
			return true;
		else
			return false;
	}

}
