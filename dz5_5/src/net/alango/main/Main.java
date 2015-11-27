package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input any text:");
		System.out.println("The number of words in the text string is: " + countWords(sc.nextLine()));
		sc.close();
	}

	static int countWords(String str) {
		String[] mas = str.split("[ 1234567890!@#$%ˆ&*()_+?/|',.<>§±-]");
		int words = 0;
		for (String i : mas) {
			words = words + ((i.length() == 0) ? 0 : 1);
		}
		return (words);
	}
}
