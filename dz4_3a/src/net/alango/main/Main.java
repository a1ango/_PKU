package net.alango.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your number:");
		String n = sc.nextLine();
		if (n.split("[.,]").length == 1) {
			n = n + ".00";
		} else if (n.split("[.,]")[1].length() == 1) {
			n = n + "0";
		}
		String[] mas = n.split("[.,]");
		int nInt = Integer.valueOf(mas[0]);
		int nMillions = nInt / 1000000;
		int nThousands = nInt % 1000000 / 1000;
		int nUnits = nInt % 1000;
		int nCents = (int) Math.round(Double.valueOf(mas[1]) / (int) (Math.pow(10, mas[1].length() - 2)));
		System.out.println("You've entered the following amount of dollars:");
		System.out.println(numToText(nMillions, "millions") + numToText(nThousands, "thousands")
				+ (nInt == 0 ? "zero " : numToText(nUnits, "")) + "dollars  and  "
				+ (numToText(nCents, "") == "" ? "zero" : numToText(nCents, "")) + " cents");
		sc.close();
	}

	static String numToText(int n, String t) {
		String textOut = new String();
		textOut = (n > 0) ? (xxxText(n) + " " + t + " ") : "";
//		System.out.println("(" + textOut + ")");
		return textOut;
	}

	static String xxxText(int n) {
		String texting = Integer.toString(n);
		// System.out.print(texting);
		String[] x = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten " };
		String[] xx = { "", "eleven ", "twelve ", "thirteen ", "forteen ", "fifteen ", "sixteen ", "seventeen ",
				"eighteen ", "nineteen" };
		String[] xxx = { "", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety " };
		texting = (n / 100 > 0) ? (x[n / 100] + " hundreds ") : "";
		if (n % 100 < 20) {
			if (n % 100 <= 10) {
				texting = texting + x[n % 100];
			} else {
				texting = texting + xx[n % 100 - 10];
			}
		} else {
			texting = texting + xxx[(n % 100) / 10 - 1] + x[n % 10];
		}
		return texting;
	}

}
