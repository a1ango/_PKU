package net.alango.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findMax(5,findMax(6,9)));
	}

	
	
	
	static int findMax(int a, int b){
		return (a>b)?a:b;
	}
	
}
