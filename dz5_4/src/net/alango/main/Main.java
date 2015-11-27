package net.alango.main;

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the mas:");
		System.out.println();
		int n = sc.nextInt();
		int[] mas = randMas(n, 1, 100);
		outMas(mas);
		System.out.println("Enter the element for the search:");
		int element = sc.nextInt();
		System.out.println();
		System.out.println("The position(s) of the needed element(s): ");
		System.out.println(getMinMaxMas(mas, element));
		System.out.println();
		System.out.println("Thank you!");
		sc.close();
	}

	static int[] randMas(int iSize, int lowValue, int hiValue) {
		Random rn = new Random();
		int[] mas = new int[iSize];
		for (int i = 0; i < iSize; i++) {
			mas[i] = rn.nextInt(hiValue - lowValue) + lowValue;
		}
		return mas;
	}

	static void outMas(int[] mas) {
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.println(i + 1 + "): " + mas[i] + "");
		}
		System.out.println();
	}

	static String getMinMaxMas(int[] mas, int element) {
		String result = "";
		for (int i = 0; i < mas.length; i++) {
			result = (mas[i] == element) ? (result + " " + (i + 1) + "; ") : (result);
		}
		result = (result == "") ? ("-1") : result;
		return result;
	}
}