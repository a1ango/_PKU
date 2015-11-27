package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your string and press Enter:");
		String line = " " + sc.nextLine() + " ";

		// Вариант 1

		String[] mas = line.split("[b]");
		System.out.println("The variant 1 result is: "+(mas.length - 1));

		char[] chmas = line.toCharArray();

		// Вариант 2

		int b = 0;
		for (char c : chmas) {
			b = (c == 'b') ? b + 1 : b;
		}
		System.out.println();
		System.out.println("The variant 2 result is: "+b);

		System.out.println();
		System.out.println((b==mas.length - 1)?"The both results match. So, everything seems to be alright.":"Something went wrong...");
		
		sc.close();
	}

}
