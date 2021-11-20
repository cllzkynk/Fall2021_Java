package day21_scope_arrays;

public class C06_Arrays {
	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		int arr[] = { 10, 15, 2, 45, 78 };
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			toplam += arr[i]; // 
		}
		System.out.println("Elementlerin toplami " +toplam);
	}
}
