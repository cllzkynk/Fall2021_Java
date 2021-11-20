package day14_methodCreation;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// kullanicidan 2 sayi isteyelim
		// sayilarin karelerini ve kuplerini toplayan iki ayr�
		// method yazd�ralim
		// 2 yazarsa kareler toplam� 3 yazarsak kupler toplam�n� yapan method �al��s�n

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz: ");
		int sayi2 = scan.nextInt();

		System.out.println("Karelerin toplam� icin 2 , kuplerin toplami icin 3 e basiniz.");

		int input = scan.nextInt();

		if (input == 2) {
			kare(sayi1, sayi2);

		} else if (input == 3) {
			kup(sayi1, sayi2);
		}

		else {
			System.out.println("Lutfen 2 yada 3 u tuslay�n�z.");
		}
		scan.close();
	}

	private static void kup(int sayi1, int sayi2) {
		System.out
				.println("Girdiginiz sayilarin kuplerinin toplami: " + (sayi1 * sayi1 * sayi1 + sayi2 * sayi2 * sayi2));

	}

	private static void kare(int sayi1, int sayi2) {
		System.out.println("Girdiginiz sayilarin karesinin toplam�: " + (sayi1 * sayi1 + sayi2 * sayi2));

	}
}