package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input r and press Enter:");
		double r = sc.nextDouble();
//		double r = 137;
		
		
		System.out.println("Input fullprice and press Enter:");
		double fullprice = sc.nextDouble();
//		double fullprice = 21.3;
		
		System.out.println("Input fuel and press Enter:");
		double fuel = sc.nextDouble();
//		double fuel = 11;

		double money;
		
		money = fuel / 100 * fullprice * r * 2;
				
		System.out.println(money + "UAH");
		sc.close();
	}

}
