package net.alango.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = 0;
		int y1 = 0;
		int x2 = 4;
		int y2 = 4;
		int x3 = 6;
		int y3 = 1;

		System.out.println("Введите координаты точки:");
		Double x0 = sc.nextDouble();
		Double y0 = sc.nextDouble();

		Double exp1 = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
		Double exp2 = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
		Double exp3 = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

		if (exp1 == 0 || exp2 == 0 || exp3 == 0) {
			System.out.println("Точка лежит на линии треугольника");
		} else {
			if ((exp1 > 0 && exp2 > 0 && exp3 > 0) || (exp1 < 0 && exp2 < 0 && exp3 < 0)) {
				System.out.println("Точка лежит внутри треугольника");
			} else {
				System.out.println("Точка НЕ лежит внутри треугольника");
			}
		}

		sc.close();
	}
}