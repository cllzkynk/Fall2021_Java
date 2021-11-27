package day23_multiDimensionalArrays;

public class Q01ArrayinElementleriIleIslemler {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
		// yazdiran bir method yaziniz.

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 4, 5, 6 };

		carpim(arr1, arr2);
		topla(arr1, arr2);
		concat(arr1, arr2);

	}

	public static void concat(int[] arr1, int[] arr2) {
		String conct = "";
		for (int i = 0; i < arr1.length; i++) {
			conct += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			conct += arr2[i];
		}

		System.out.println("Iki arrayin tum elementleri concati :" + conct);

	}

	public static void topla(int[] arr1, int[] arr2) {
		int toplam = 0;
		for (int i = 0; i < arr1.length; i++) {
			toplam += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			toplam += arr2[i];
		}

		System.out.println("Iki arrayin tum elementleri toplami :" + toplam);

	}

	public static void carpim(int[] arr1, int[] arr2) {
		int carpim = 1;

		for (int i = 0; i < arr1.length; i++) {
			carpim *= arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			carpim *= arr2[i];
		}

		System.out.println("Iki arrayin tum elementleri carpimi :" + carpim);

	}

}
