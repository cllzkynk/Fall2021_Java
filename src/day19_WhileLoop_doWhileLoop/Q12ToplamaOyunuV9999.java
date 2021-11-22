package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q12ToplamaOyunuV9999 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a
		 * basmasini soyleyin. Kullanici yanlislikla negative sayi girerse o sayiyi
		 * dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun Kullanici
		 * 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative
		 * sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		int top = 0;
		int sayi = 1;
		int sayac = 0;
		int nsayac = 0;
		int ntop = 0;

		System.out.println("toplamak icin sayilarin giriniz girisinizi bitirmek icin 0 girisi yapiniz");
		do {
			// System.out.println("toplamak icin sayilarin giriniz girisinizi bitirmek icin
			// 0 girisi yapiniz");
			sayi = scan.nextInt();
			if (sayi > 0) {
				top = top + sayi;
				sayac++;
			}
			if (sayi < 0) {
				System.out.println("Negatif sayi giremezsin\n dikkatlice sayilarini gir . Unutma cikis butonu 0");

				nsayac++;
				ntop = ntop + sayi;
				continue;
			}

		} while (sayi != 0);

		System.out.println("Toplam " + sayac + " pozitif sayi girdiniz");
		System.out.println("Girilen potitif sayilarin toplami : " + top);
		System.out.println("\nToplam " + nsayac + " negatif sayi girdiniz");
		System.out.println("Girilen negatif sayilarin toplami : " + ntop);

		scan.close();
	}

}
