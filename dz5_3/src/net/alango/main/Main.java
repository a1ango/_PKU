package net.alango.main;

//import java.util.Random;
//import java.util.Scanner;
//import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] mas = new int[5][3];
		outMasXX(mas);
	}

	static void outMasXX(int[][] mas) {
		for (int[] is : mas) {
			for (int i : is) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}