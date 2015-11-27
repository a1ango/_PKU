package net.alango.main;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the range of the values (the number of digits):");
		System.out.println();
		int d = sc.nextInt();
		int max = 0;
		for (int i = d, p = 1; i > 0; i--) {
			max += 9 * p;
			p *= 10;
		}
		int min = max / 10 + 1;
		System.out.println();
		System.out.println("The range of the values is: " + min + "..." + max);
		maxPalindrome(min, max);

		sc.close();
	}

	static void maxPalindrome(int min, int max) {
		long prodMax = 0;
		String outText = "";
		for (int i = max; i >= min; i--) {
			for (int j = i; j >= min; j--) {
				if (checkPalindrome(i * j)) {
					// System.out.print(i + " x " + j + " = " + " --> ");
					if (prodMax < (i * j)) {
						prodMax = (i * j);
						outText = i + " x  " + j + " => " + prodMax;
					}
				}
			}

		}
		System.out.println(outText);
	}

	static boolean checkPalindrome(long a) {
		boolean rez = false;
		int trues = 0;
		String str = Long.toString(a);
		String[] mas = new String[str.length()];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = str.substring(i, i + 1);
		}
		for (int i = 0; i < mas.length / 2; i++) {
			trues += (mas[i].equals(mas[mas.length - i - 1])) ? 1 : 0;
		}
		rez = (trues == mas.length / 2);
		return rez;
	}
}
