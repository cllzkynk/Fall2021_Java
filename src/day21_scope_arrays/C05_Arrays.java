package day21_scope_arrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		// Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma
		// tasiyacak bir program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1]
		// olacak.

		int arr[] = { 1, 2, 3, };
		int temp = arr[0]; // Array 0'inci index = temp

		for (int i = 0; i < arr.length - 1; i++) { // arr.length-1 son index demek

			arr[i] = arr[i + 1];
		}
		arr[arr.length-1]= temp;
		System.out.println(Arrays.toString(arr));

	}

}
