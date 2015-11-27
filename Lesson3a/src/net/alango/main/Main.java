package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a, b and c:");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		int max = a;

//		if (max < b) {
//			max = b;
//		}
//		if (max < c) {
//			max = c;
//		}

		max = (max<b)?b:max;
		max = (max<c)?c:max;
		
		System.out.println(max);
		
		
		
		
		sc.close();
	}

}
