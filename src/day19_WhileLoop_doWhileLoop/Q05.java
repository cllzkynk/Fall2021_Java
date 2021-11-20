package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
		 * baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		 * Kullanicinin hata yapmadigini farz edin
		 * 
		 */
		Scanner giris = new Scanner(System.in);
		System.out.println("Baslangic harfinizi giriniz");
		char bas = giris.next().toUpperCase().charAt(0);
		System.out.println("Bitis  harfinizi giriniz");
		char bit = giris.next().toUpperCase().charAt(0);
		char temp = ' ';

		if (bit > bas) {

		} else if (bas > bit) {
			bas = temp;
			bas = bit;
			bit = temp;
		} else {
			System.out.println("ayni harflerin arasini nasil bulalim aga");
		}

		while (bas <= bit) {

			System.out.print(bas + " ,");

			bas++;
		}

		giris.close();

	}

}
