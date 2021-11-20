package day13_stringManipulations;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa
		 * “Girdiginiz isim a harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz
		 * isim Z harfi iceriyor” - ikisi de yoksa “Girdiginiz isim a veya Z harfi
		 * icermiyor” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine();

		if (isim.contains("a") && !isim.contains("Z")) {
			System.out.println("Girdiginiz isim   (kucuk a) Harfi iceriyor");
		} else if (!isim.contains("a") && isim.contains("Z")) {
			System.out.println("Girdiginiz isim   (buyuk Z) Harfi iceriyor");
		} else if (isim.contains("a") && isim.contains("Z")) {
			System.out.println("Girdiginiz isim  (kucuk a) ve (buyuk Z) Harfi iceriyor");
		} else {
			System.out.println("Girdiginiz isim (kucuk a) veya (buyuk Z) harfi icermiyor");
		}
scan.close();
	}

}
