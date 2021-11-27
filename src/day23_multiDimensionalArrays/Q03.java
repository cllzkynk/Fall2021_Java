package day23_multiDimensionalArrays;

public class Q03 {

	static int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
	static int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12} };

	public static void main(String[] args) {

		/*
		 * Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e
		 * sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
		 * arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		 */

		int toplam = 0;
		for (int i = 0; i < arr1.length && i < arr2.length; i++) {
			for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) {

				toplam = toplam + arr2[i][j] + arr1[i][j];

			}
		}

		System.out.println(toplam);

	}

}
