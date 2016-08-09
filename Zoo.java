package com.tiy.zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {

		ArrayList<Animals> myZoo = new ArrayList<>();
		
		Panther pink = new Panther("cat", "pink insulation", true, true, 2, "none", "show biz", 3, "pink", true);
		Lion leon = new Lion("cat", "fur", false, true, 2, "anything moving", "big", "Africa", true);
		Bear yoogi = new Bear("Grizzly", "dirt", true, true, 2, "stingy campers", "Jelly Stone", "brown", 12);
		Snake simpson = new Snake("black", "scales", false, true, 2, "rodents", false, false);
		Penguin devito = new Penguin("Iceberg", "wet skin", false, false, 2, "fish", false, "black and white");
		Monkey showbiz = new Monkey("Brown", "skin", true, true, 2, "McDonalds", "Bubbles", true, 30);
		Lizard lucky = new Lizard("Kumono", "scales", true, false, 2, "people", true, "dragon");
		Alligator alton = new Alligator("Ally", "scales", false, false, 2, "crocodile hunters", true, 40);
		Shark markCuban = new Shark("Business", "money", true, true, 2, "broke people with dreams", true, 2000);
		Whale willis = new Whale("fish", "skin", false, false, 2, "schools of fish", true, "killer", 3000);
		Tarantulas tommyT = new Tarantulas("spidey", "hair", false, true, 8, "bugs", true, true);
		
		myZoo.add(pink);
		myZoo.add(leon);
		myZoo.add(yoogi);
		myZoo.add(simpson);
		myZoo.add(devito);
		myZoo.add(showbiz);
		myZoo.add(lucky);
		myZoo.add(alton);
		myZoo.add(markCuban);
		myZoo.add(willis);
		myZoo.add(tommyT);
		
		for (int i = 0; i < myZoo.size(); i++) {
			System.out.println(myZoo.get(i));
		}
		
		
	}

}
