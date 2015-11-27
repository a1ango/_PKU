package net.alango.main;

import java.util.Scanner;
//import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create random mas:
		System.out.println("Input any set of numbers devided by comma (',') and press Enter:");
		System.out.println();
		String str = sc.nextLine();
		System.out.println("The set w/o twins: "+removeTwins(str));
		int[] mas = strToArray(str);
		outMasX("You entered the following set of numbers: ", mas);

		// /* Get Max/Min from mas X */
		// System.out.println("The maximum value of the mas:" +
		// getMinMaxMas(mas, "+"));
		// System.out.println("The minimum value of the mas:" +
		// getMinMaxMas(mas, "-"));

		// /* Print the number of words in text string */
		// System.out.println("Input any text:");
		// System.out.println("The number of words in the text string is: " +
		// countWords(sc.nextLine()));

		System.out.println();
		System.out.println("Thank you!");
		sc.close();
	}

	static void outMasX(String t, int[] mas) {
		System.out.println();
		System.out.println(t);
		System.out.println();

		for (int i : mas) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static int[] strToArray(String str) {

		String[] masStr = str.split("[,]");
		int[] masInt = new int[masStr.length];
		for (int i = 0; i < masInt.length; i++) {
			masInt[i] = Integer.parseInt(masStr[i]);
		}
		return masInt;
	}

	static String removeTwins(String str) {
		String newStr = new String();
		for (int i = 1; i < str.length(); i++) {

			System.out.println(i + ": " + str.substring(0, i) + "+");
			System.out.println(str.substring(i, i) + "*");
			newStr = newStr + (str.substring(0, i).contains(str.substring(i, i)) ? "" : str.substring(i, i));
			// System.out.println(countChars(str, str.substring(i, i + 1)));
		}
		return newStr;
	}

	static int[] sortMasX(int[] mas, String dir) {
		switch (dir) {
		case "+":
			for (int i = 0; i < mas.length; i++) {
				for (int j = i; j < mas.length; j++) {
					int temp;
					if (mas[j] < mas[i]) {
						temp = mas[j];
						mas[j] = mas[i];
						mas[i] = temp;
					}
				}
			}
			break;
		case "-":
			for (int d = 1; d > 0;) {
				d = 0;
				for (int i = 0; i < mas.length - 1; i++) {
					int temp;

					if (mas[i] < mas[i + 1]) {
						temp = mas[i];
						mas[i] = mas[i + 1];
						mas[i + 1] = temp;
						d = 1;
					}
				}
			}
			break;
		default:
		}
		return mas;
	}

	static int getMinMaxMas(int[] mas, String dir) {
		int result = mas[0];
		switch (dir) {
		case "+":
			for (int i : mas) {
				result = (result > i) ? (result) : (i);

			}
			break;
		case "-":
			for (int i : mas) {
				result = (result < i) ? (result) : (i);

			}
			break;
		default:
			System.out.println("WRONG!");
		}
		return result;
	}

	static int countWords(String str) {
		String[] mas = str.split("[ 1234567890!@#$%ˆ&*()_+?/|',.<>§±-]");
		int words = 0;
		for (String i : mas) {
			words = words + ((i.length() == 0) ? 0 : 1);
		}
		return (words);
	}

	static int countChars(String str, String ch) {
		String[] mas = (" " + str + " ").split("[" + ch + "]");
		return mas.length - 1;
	}

}