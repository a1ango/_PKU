package net.alango.main;

import java.util.*;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите длину массива:");
		int masL = sc.nextInt();

		int[] mas = new int[masL];

		for (int i = 0; i < masL; i++) {
			System.out.println("Введите " + (i + 1) + "-й элемент массива");
			mas[i] = sc.nextInt();
		}

		System.out.println("Вы сформировали следующий ммассив: " + Arrays.toString(mas));
		sc.close();
	}
}