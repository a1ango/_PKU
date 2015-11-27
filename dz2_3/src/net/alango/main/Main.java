package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double r = 0;
		double l = 0;		
		
		System.out.println("Input the radius of the circle and press Enter:");		
		r = sc.nextDouble();
		
		l = 2 * Math.PI * r; // the length of the circle
		
		System.out.println("the length of the circle: " + l);
		System.out.println("done.");
		sc.close();
	}

}
