package com.tiy.piglatin;

public class PigLatinConverter {

	StringBuilder modUserInput = new StringBuilder();

	public String changeNothing(String word) {

		char firstLetter = word.charAt(0);
		if (firstLetter == 'a' || firstLetter == 'A' || firstLetter == 'e' || firstLetter == 'E' || firstLetter == 'i'
				|| firstLetter == 'I' || firstLetter == 'o' || firstLetter == 'O' || firstLetter == 'u'
				|| firstLetter == 'U' || firstLetter == 'y' || firstLetter == 'Y') {
			System.out.println(word + "-yay");
			return word + "-yay";
			
		} else {
			String aNewWord = changeFirstLetter(word);
			return aNewWord;
		}

	}
	/*
	 * 
	 * */
	public String changeFirstLetter(String word) {
		char firstLetter = word.charAt(0);
		char secondLetter = word.charAt(1);
		if ((secondLetter == 'a' || secondLetter == 'A' || secondLetter == 'e' || secondLetter == 'E'
				|| secondLetter == 'i' || secondLetter == 'I' || secondLetter == 'o' || secondLetter == 'O'
				|| secondLetter == 'u' || secondLetter == 'U' || secondLetter == 'y' || secondLetter == 'Y')) {
			System.out.println(word.substring(1) + "-" + firstLetter + "ay");
			return (word.substring(1) + "-" + firstLetter + "ay");
		} else {
			String aNewWord2 = changeFirstTwoLetters(word);
			return aNewWord2;
		}
//		return word;
	}

	public String changeFirstTwoLetters(String word) {
		char firstLetter = word.charAt(0);
		char secondLetter = word.charAt(1);
		char thirdLetter = word.charAt(2);
		if ((thirdLetter == 'a' || thirdLetter == 'A' || thirdLetter == 'e' || thirdLetter == 'E' || thirdLetter == 'i'
				|| thirdLetter == 'I' || thirdLetter == 'o' || thirdLetter == 'O' || thirdLetter == 'u'
				|| thirdLetter == 'U' || thirdLetter == 'y' || thirdLetter == 'Y')) {
			System.out.println(word.substring(2) + "-" + firstLetter + secondLetter + "ay");
			return (word.substring(2) + "-" + firstLetter + secondLetter + "ay");
		} else {
			String aNewWord3 = changeFirstThreeLetters(word);
			return aNewWord3;
		}
//		return word;

	}

	public String changeFirstThreeLetters(String word) {
		char firstLetter = word.charAt(0);
		char secondLetter = word.charAt(1);
		char thirdLetter = word.charAt(2);
		System.out.println(word.substring(3) + "-" + firstLetter + secondLetter + thirdLetter + "ay");
		return (word.substring(3) + "-" + firstLetter + secondLetter + thirdLetter + "ay");

	}

}

// char str1;
// char str2;
//
//
// public char getStr1() {
// return str1;
// }
//
// public void setStr1(char str1) {
// this.str1 = str1;
// }
//
// public char getStr2() {
// return str2;
// }
//
// public void setStr2(char str2) {
// this.str2 = str2;
// }

// setStr1('A');
// System.out.println(getStr1());

// public void test(){
// char a = 'a';
// System.out.println(a);
// }

//public void getUserPigLatinList() {
//	for (int i = 0; i <= userPigLatinList.size(); i++) {
//		System.out.println(userPigLatinList);
//	}
//
//}