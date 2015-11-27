package net.alango.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc= new Scanner(System.in);
		int[] a;
		int n;
		System.out.println("Input arrays size and press Enter:");
		n = sc.nextInt();
		a=(n>0)?(new int[n]):(new int[5]);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=rn.nextInt(100);
		}
		
		int[] b=new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);

		System.out.println(a + " " + Arrays.toString(a));

		System.out.println(b + " " + Arrays.toString(b));
		
		a=b;
		

		System.out.println(a + " " + Arrays.toString(a));

		System.out.println(b + " " + Arrays.toString(b));

		
	}

}
