package day15_methodCreation;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini, 100’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */

		// tek mi ????? negatif pozif ???? yuzden buyuk kucuk

		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi gir");
		int sayi = scan.nextInt();

		tekMi(sayi);
		pozitifNegatif(sayi);
		YuzeGore(sayi);
		scan.close();
	} // main sonu

	public static void YuzeGore(int sayi) {
		int rakamlarToplami;
		if (sayi <= 999 && sayi > 100) {
			rakamlarToplami = (int) (sayi % 10 + ((sayi / 10) % 10) + (sayi / 100));
			System.out.println("Rakamlar toplami  : " + rakamlarToplami);
		} else {
			System.out.println("Sayi 100`den kucuk ve birler basamagi :" + (sayi % 10));
		}

	}

	public static void pozitifNegatif(int sayi) {
		if (sayi < 0) {
			System.out.println("Sayi negatif");
		} else if (sayi > 0) {
			System.out.println("Sayi pozitiftir");
		}
	}

	public static void tekMi(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("Sayi Ciftir");
		} else {
			System.out.println("Sayi Tektir");
		}
	}

} // class sonu
