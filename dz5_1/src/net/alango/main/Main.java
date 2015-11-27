package net.alango.main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the mas:");
		System.out.println();
		int n = sc.nextInt();
		int[][] mas = randMas(n, n, 10, 100);

		/* Print mas X: */
		outMas("The new random mas is:", mas);

		System.out.println();

		/* Get Max/Min from mas X */
		System.out.println("Choose what value of the mas you would like to get:");
		System.out.println(" - for the Maximum value input '+';");
		System.out.println(" - for the Minimum value input '-';");

		sc.nextLine();
		String mm = sc.nextLine();

		System.out.println("The result is: " + getMinMaxMas(mas, mm));

		sc.close();
	}

	static int[][] randMas(int jSize, int iSize, int lowValue, int hiValue) {
		Random rn = new Random();
		int[][] mas = new int[iSize][jSize];
		for (int i = 0; i < iSize; i++) {
			for (int j = 0; j < jSize; j++) {
				mas[i][j] = rn.nextInt(hiValue - lowValue) + lowValue;
			}
		}
		return mas;
	}

	static void outMas(String t, int[][] mas) {
		System.out.println();
		System.out.println(t);
		System.out.println();
		for (int[] is : mas) {
			for (int i : is) {
				System.out.print(i + " ");
				// System.out.println(Arrays.toString(mas));
			}
			System.out.println();
		}
		System.out.println();
	}

	static int getMinMaxMas(int[][] mas, String dir) {
		int result = mas[0][0];
		switch (dir) {
		case "+":
			for (int[] is : mas) {
				for (int i : is) {
					result = (result > i) ? (result) : (i);
				}
			}
			break;
		case "-":
			for (int[] is : mas) {
				for (int i : is) {
					result = (result < i) ? (result) : (i);
				}
			}
			break;
		default:
			System.out.println("wrong");
		}
		return result;
	}
}
