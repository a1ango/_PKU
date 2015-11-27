package net.alango.main;

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create random mas:
		System.out.println("Input the size of the mas:");
		System.out.println();
		int n = sc.nextInt();
		int[][] mas = randMas(n, n, 10, 100);

		/* Print mas XX: */
		outMasXX("The new random mas is:", mas);

		/* Print mas XX and Transform mas: */
		outMasXX("The result of the transforming:", transMas(mas));

		/* Print mas X and Sort mas X (+/-): */
		outMasX("The result of the sorting '+':", sortMasX(mas[0], "+"));
		outMasX("The result of the sorting '-':", sortMasX(mas[0], "-"));

		/* Get Max/Min from mas X */
		System.out.println("The maximum value of the mas:" + getMinMaxMas(mas, "+"));
		System.out.println("The minimum value of the mas:" + getMinMaxMas(mas, "-"));

		/* Print the number of words in text string */
		System.out.println("Input any text:");
		System.out.println("The number of words in the text string is: " + countWords(sc.nextLine()));
	
		System.out.println();
		System.out.println("Thank you!");
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

	static int[][] transMas(int[][] mas) {
		Scanner sc = new Scanner(System.in);
		int n = mas.length;
		System.out.println();
		System.out.println("Choose one of the following options:");
		System.out.println(" - to rotate the mas in clockwise direction, input '+';");
		System.out.println(" - to rotate the mas in counterclockwise direction, input '-';");
		System.out.println(" - to transpose the mas, input '/';");
		System.out.println();
		switch (sc.nextLine()) {
		case "+":
			System.out.println();
			System.out.println("You chose rotating in clockwize direction.");
			for (int i = 0, tmp; i < n / 2; i++) {
				for (int j = i; j < (n - i - 1); j++) {
					tmp = mas[j][i];
					mas[j][i] = mas[n - i - 1][j];
					mas[n - i - 1][j] = mas[n - j - 1][n - i - 1];
					mas[n - j - 1][n - i - 1] = mas[i][n - j - 1];
					mas[i][n - j - 1] = tmp;
				}
			}
			break;
		case "-":
			System.out.println();
			System.out.println("You chose rotating in ccounterclockwize direction.");
			for (int i = 0, tmp; i < n / 2; i++) {
				for (int j = i; j < (n - i - 1); j++) {
					tmp = mas[j][i];
					mas[j][i] = mas[i][n - j - 1];
					mas[i][n - j - 1] = mas[n - j - 1][n - i - 1];
					mas[n - j - 1][n - i - 1] = mas[n - i - 1][j];
					mas[n - i - 1][j] = tmp;
				}
			}
			break;
		case "/":
			System.out.println();
			System.out.println("You chose transposing.");
			for (int i = 0, tmp; i < n; i++) {
				for (int j = i; j < n; j++) {
					tmp = mas[j][i];
					mas[j][i] = mas[i][j];
					mas[i][j] = tmp;
				}
			}
			break;
		default:
			System.out.println();
			System.out.println("Wrong: the mas has not changed!");
		}
		sc.close();
		return mas;
	}

	static void outMasX(String t, int[] mas) {
		System.out.println();
		System.out.println(t);
		System.out.println();

		for (int i : mas) {
			System.out.print(i + " ");
			// System.out.println(Arrays.toString(mas));
		}
		System.out.println();
	}

	static void outMasXX(String t, int[][] mas) {
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
}