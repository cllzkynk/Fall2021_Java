package day23_multiDimensionalArrays;

import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Asagidaki multi dimensional array段n ic array値erindeki tum
		 * elemanlarin toplamini birer birer bulan ve herbir sonucu yeni bir array段n
		 * elemani yapan ve yeni array段 ekrana yazdiran bir program yaziniz
		 * 
		 * { {1,2,3},{4,5}, {6,7} }
		 * 
		 * 
		 * 
		 * Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9,
		 * 13}
		 */

		int arr1[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 28 }, { 5, 1 } };
		int arrYeni[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arrYeni[i] += arr1[i][j];
			}
		}

		System.out.println(Arrays.toString(arrYeni));

	}

}
