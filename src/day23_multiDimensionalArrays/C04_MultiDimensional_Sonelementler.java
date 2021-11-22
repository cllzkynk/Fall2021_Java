package day23_multiDimensionalArrays;

public class C04_MultiDimensional_Sonelementler {
	static int arr[][] = { { 1, 2 }, { 4, 5, 6, 7 }, { 3 } };

	public static void main(String[] args) {
		// 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin
		// carpimini ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

		carpim(arr);

	}

	public static void carpim(int[][] arr2) {
		int carpim = 1;
		for (int i = 0; i < arr.length; i++) {

			carpim *= arr[i][arr[i].length - 1];
		}
		System.out.println("inerlarin son elementleri carpimi " + carpim);
	}

}
