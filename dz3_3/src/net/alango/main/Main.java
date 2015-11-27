package net.alango.main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество полос:");
		int n = sc.nextInt();

		System.out.println("Введите высоту полос:");
		int h = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 != 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Enjoy!");
		sc.close();
	}
}
