package net.alango.main;

//import java.util.Random;
//import java.util.Scanner;
//import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		System.out.println(merge(10, 2.1092, "The result is: "));
	}

	static String merge(int i, double d, String s) {
		String all = s + (i + d);
		return all;
	}

}