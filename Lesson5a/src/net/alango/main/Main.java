package net.alango.main;

public class Main {

	public static void main(String[] args) {
	
		int[] array = {2,4,8,18,-4};
		System.out.println(findMin(array));
		triangle(9);

		
		}
		
	
	static void triangle(int n){
		for (int i=1; i<=n; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static int findMin(int[] array){
		
		int min =array[0];
		for (int i : array) {
			if (i<min){
				min = i;
			}
		}
		return min;
	}
	
}
