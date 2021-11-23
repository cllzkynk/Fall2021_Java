package day23_multiDimensionalArrays;

import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip,
		 * kalanlari yeni bir Array olarak yazdiran bir method yaziniz
		 */
		int count = 0;
		int sayac = 0;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 5, 3, 5, 7, 4, 6, 3, 2, 1, 8, 9, 6, 158 };
		int aranan = 158;
		for (int i = 0; i < arr.length; i++) {
			if (aranan == arr[i]) {
				sayac++;
			}
		}

		// System.out.println(sayac);

		int arrYeni[] = new int[arr.length - sayac];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arrYeni.length; j++) {

				if (arr[i] != aranan) {
					arrYeni[j + count] = arr[i];

					count++;
					break;
				}

			}

		}
		System.out.println(Arrays.toString(arrYeni));
	}

}
