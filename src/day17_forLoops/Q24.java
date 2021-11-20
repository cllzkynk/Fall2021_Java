package day17_forLoops;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		// tamsayilari
		// toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi gir ");
		int sayi1 = scan.nextInt();
		System.out.println("ikinci  tamsayiyi gir ");
		int sayi2 = scan.nextInt();
		int emanet = 0;
		int toplam = 0;

		if (sayi1 > sayi2) {
			sayi1 = sayi1;
			sayi2 = sayi2;

			for (int i = sayi2; i <= sayi1; i++) {
				toplam += i;
			}
			System.out.println(toplam);

		} else if (sayi2 > sayi1) {
			sayi1 = emanet;
			sayi1 = sayi2;
			sayi2 = emanet;

			for (int i = sayi2; i <= sayi1; i++) {
				toplam += i;
			}
			System.out.println(toplam);

		} else {
			System.out.println("Esit sayilar arasinda ki sayilari nasil toplayalim aga");
		}
scan.close();
	}

}
