
package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArraysConcatTwoArr {

	public static void main(String[] args) {
		// verilen iki arrayi birlestir ve birlesik array olarak yaziniz

		int arr1[] = { 3, 5, 7, 10,11 };
		int arr2[] = { 2, 4, 6, 8, 9,12 };
		int birlesikarr[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			birlesikarr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			birlesikarr[arr1.length + i] = arr2[i];
		}
		Arrays.sort(birlesikarr);
		System.out.println(Arrays.toString(birlesikarr));

	}

}
