package day07_IfStatementsOdevler;

import java.util.Scanner;

public class Q2_GunKutsal {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		 * gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
		 * “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz");
		String gun = scan.next().toUpperCase();

		if (gun.equals("CUMA")) {
			System.out.println(gun + " gunu Muslumanlar icin kutsal gundur");
		}

		if (gun.equals("CUMARTESI")) {
			System.out.println(gun + " gunu Yahudilerr icin kutsal gundur");
		}
		if (gun.equals("PAZAR")) {
			System.out.println(gun + " gunu Hristiyanlar icin kutsal gundur");
		}
		if (!gun.equalsIgnoreCase("CUMA") && !gun.equalsIgnoreCase("CUMARTESI") && !gun.equalsIgnoreCase("PAZAR")) {
			System.out.println("Lutfen dogru durust giris yapiniz "
					+ "\nbiz bu kodu yazana kadar ne emekler cekiyoruz biliyormusunuz..???"
					+ "\nGenc IT`ciler rahatsiz");
			scan.close();
		}
	}

}
