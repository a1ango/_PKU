package net.alango.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int r = 4;

		System.out.println("Введите координаты точки:");
		Double x = input.nextDouble();
		Double y = input.nextDouble();

		Double point = Math.sqrt(x * x + y * y);
		System.out.println(point);
		if (point <= r) {
			System.out.println("Точка лежит внутри круга");
		} else {
			System.out.println("Точка НЕ лежит внутри круга");
		}

		input.close();
	}
}