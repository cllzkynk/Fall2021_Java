package day23_multiDimensionalArrays;

public class Q02SonElementlerIslemleri {

	static int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

	public static void main(String[] args) {
		/*
		 * Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son
		 * elemanlarin carpimini ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5},
		 * {6} }
		 * 
		 */
		// Arrayi yukarda static olusturdum.

		sonElementYanyanaYaz(arr);
		sonElementCarp(arr);
		sonElementtopla(arr);

	}

	@SuppressWarnings("unused")
	public static void sonElementCarp(int[][] arr) {
		int carpim = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				carpim *= arr[i][arr[i].length - 1];
				break;
			}
		}
		System.out.println("Son elementler carpimi " + carpim);
	}

	@SuppressWarnings("unused")
	public static void sonElementtopla(int[][] arr) {
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				toplam += arr[i][arr[i].length - 1];
				break;
			}
		}
		System.out.println("Son elementler toplami " + toplam);
	}

	@SuppressWarnings("unused")
	public static void sonElementYanyanaYaz(int[][] arr) {
		String yanYana = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				yanYana += arr[i][arr[i].length - 1];
				break;
			}

		}
		System.out.println("Son elementlerin yanyana yazimi " + yanYana);
	}
}
