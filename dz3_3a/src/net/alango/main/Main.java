package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите максимальную высоту фигуры:");
		int max = sc.nextInt();

		for (int i = 1, k = 1, d = 1; k > 0; i += d * d) {
			System.out.print("*");
			if (i == k) {
				i = 0;
				k += d;
				System.out.println();
			}
			if (k > max) {
				d = -d;
				k -= 2;
			}
		}

		sc.close();
	}
}