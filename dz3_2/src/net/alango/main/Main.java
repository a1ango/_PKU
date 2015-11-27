package net.alango.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int porches = 4;
		int floors = 9;
		int apPerFloor = 4;
		int ap = 1;

		int aps = apPerFloor * floors * porches;

		for (; ap > 0;) {
			System.out.println("Введите номер искомой квартиры:");
			ap = sc.nextInt();

			if (ap > aps) {
				System.out.println("Простите, но в этом доме всего " + aps + " квартир.");
			} else {
				if (ap <= 0) {
					sc.close();
					System.out.println("Спасибо!");
				} else {
					int porch = 1 + (ap - 1) / (apPerFloor * floors);

					int floor = 1 + (ap - 1 - (porch - 1) * apPerFloor * floors) / apPerFloor;

					System.out.println("Квартира расположена в " + porch + "-м подъезде на " + floor + "-м этаже.");
				}
			}
		}

	}

}
