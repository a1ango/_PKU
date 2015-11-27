package net.alango.main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] a = new int[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = rn.nextInt(20);
		}
		print(a);
		sortdown(a);

		sort(a);
		print(a);
		sortdown(a);
		print(a);
	}

	static void print(int[] a) {
		System.out.println();
		for (int k : a) {
			System.out.print(k + " ");
		}
	}

	static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int temp;
				if (a[j] < a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

	}

	static void sortdown(int[] a) {
		for (int d = 1; d > 0;) {
			d = 0;
			for (int i = 0; i < a.length - 1; i++) {
				int temp;

				if (a[i] < a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					d = 1;
				}
			}
		}

	}
}