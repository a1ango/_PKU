package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input number within 1...100:");
		int n = sc.nextInt();

		for ( int i = n; i <= 100 ; i += n ){
			
				System.out.println(i);
			}
		
		
		
		
		
		
		sc.close();
	}

}
