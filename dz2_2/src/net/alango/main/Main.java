package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		double p = 0;
		double s = 0;
		
		
		System.out.println("Input the a-side of the triangle and press Enter:");		
		a = sc.nextDouble();
		
		System.out.println("Input the b-side of the triangle and press Enter:");		
		b = sc.nextDouble();
		
		System.out.println("Input the c-side of the triangle and press Enter:");		
		c = sc.nextDouble();
		
		p = ( a + b + c ) / 2; // semiperimeter
		s = Math.sqrt( p * ( p - a ) * ( p - b ) * ( p - c ) );  // the area by the Heron's formula
		
		System.out.println("The area: " + s);
		System.out.println("done.");
		sc.close();
	}

}
