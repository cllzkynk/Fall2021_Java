package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis
		// degeri
		// dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana
		// yazdiriniz.

		Scanner giris = new Scanner(System.in);
		System.out.println("Baslangic noktanizi tam sayi olarak giriniz");
		int bas = giris.nextInt();
		System.out.println("Bitis noktanizi tam sayi olarak giriniz");
		int bit = giris.nextInt();
		int temp = 0;

		if (bit > bas) {

		} else if (bas > bit) {
			bas = temp;
			bas = bit;
			bit = temp;
		} else {
			System.out.println("ayni sayilarin arasini nasil bulalim aga");
		}

		while (bas <= bit) {
			if (bas % 2 == 0) {
				System.out.print(bas + " ,");
			}
			bas++;
		}

		giris.close();

	}

}
