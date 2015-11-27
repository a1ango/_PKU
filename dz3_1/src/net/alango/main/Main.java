package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Введите количество рассматриваемых чисел:");
		int n = input.nextInt();

		System.out.println("Введите 1-е число");

		double max = input.nextDouble();
		double number;

		for (int i = 2; i <= n; i++) {
			System.out.println("Введите " + i + "-е число:");
			number = input.nextDouble();

			if (max < number) {
				max = number;
			}
		}
		System.out.println("Максимальным из Ваших " + n + " чисел является число " + max);
		input.close();
	}
}
