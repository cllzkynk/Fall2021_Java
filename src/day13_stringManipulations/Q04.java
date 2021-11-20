package day13_stringManipulations;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
		 * yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine();

		System.out.println("Lutfen soyisminizi giriniz");
		String soyIsim = scan.nextLine();

		System.out.println("Isminizde  " + isim.length() + " harf var ve  Soy isminizde  " + soyIsim.length()
				+ " harf var\nIsim-Soyisminizde ise toplam  " + isim.concat(soyIsim).length() + " harf var\n\nSonuc olarak ;\n");
		
		if (isim.length() == soyIsim.length()) {
			System.out.println("girilen isim ve soyisim esit uzunlukta");
		} else if (isim.length() > soyIsim.length()) {
			System.out.println("girilen isim soyisimden uzun");
		} else {
			System.out.println("girilen isim soyisimden kisa");
		}
		scan.close();
	}

}
