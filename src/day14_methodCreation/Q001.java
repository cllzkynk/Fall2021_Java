package day14_methodCreation;

import java.util.Scanner;

public class Q001 {

	// bizim urettigimiz metodlar burada olabilir
	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.
		// Bu methodu main methodun disinda olusturup main methodun
		// icinden cagiriniz.

		Scanner giris = new Scanner(System.in);
		System.out.println("Birimi gir");
		String birim = giris.next().toLowerCase();
		System.out.println("Miktari giriniz gir");
		double miktar = giris.nextDouble();

		donusturucu(birim, miktar);
		
	
		giris.close();
	}
	// bizim urettigimiz metodlar burada olabilir

	public static void donusturucu(String birim, double miktar) {

		switch (birim) {
		case "saat":
			System.out.println(miktar * 60 * 60);
			break;
		case "mil":
			System.out.println(miktar * 1.6);
			break;
		case "kilogram":
			System.out.println(miktar*1000);
			break;
		default: System.out.println("saat mil veya kilogramdan birini duzgun giriniz");
			
		}

	}
}
