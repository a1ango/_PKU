package net.alango.main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (n > 4 && n < 16) {
			int f = 1;

			System.out.print(n + "! = " + n);
			for (int i = n; i > 1; i--) {
				System.out.print("*" + (i - 1));
				f = f * i;
			}
			System.out.println(" = " + f);
		} else {
			System.out.println();
			System.out.println("Число " + n + " лежит вне пределов 4<...<16");
		}
		sc.close();
	}
}
