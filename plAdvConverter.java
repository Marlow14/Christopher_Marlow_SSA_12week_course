package com.tiy.piglatin;

public class plAdvConverter {
	
	public static void wordConverter(String word) {

		StringBuilder modUserInput = new StringBuilder(word);
		String convWord;
		char[] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		boolean flag = true;
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = 0; j < word.length(); j++)
			{
				if (word.charAt(j) == ch[i] && flag) {
					convWord = modUserInput.substring(j);
					System.out.println(convWord + "-" + word.substring(0, j) + "ay");
					flag = false;
				}

			}

			// if (flag) {
			// switch (word.charAt(i)) {
			// case 'a':
			// convWord = modUserInput.substring(i);
			// System.out.println(convWord + "-" + word.substring(0,(i)) +
			// "ay");
			// flag = false;
			// break;
			// case 'e':
			// convWord = modUserInput.substring(i);
			// System.out.println(convWord);
			// flag = false;
			// break;
			// case 'i':
			// convWord = modUserInput.substring(i);
			// System.out.println(convWord);
			// flag = false;
			// break;
			// case 'o':
			// convWord = modUserInput.substring(i);
			// System.out.println(convWord);
			// flag = false;
			// break;
			// case 'u':
			// convWord = modUserInput.substring(i);
			// System.out.println(convWord);
			// flag = false;
			// break;
			// default:
			// flag = true;
			// break;
			// }
			// }
			//
		}

	}

}
