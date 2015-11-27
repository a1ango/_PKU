package net.alango.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[15];

		for (int i = 0; i < a.length; i++) {
			a[i] = rn.nextInt(100);
		}

		int[] b = new int[a.length * 2];
		System.arraycopy(a, 0, b, 0, a.length);

		for (int i = 0; i < a.length; i++) {
			b[i + a.length] = a[i] * 2;
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
