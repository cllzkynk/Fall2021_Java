package day13_stringManipulations;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten
		 * yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 harfli  Bir kelime giriniz");
		String kelime = scan.nextLine();
		if (kelime.length() == 4) {
			System.out.println("Char `li cozum\ngirdiginiz kelimenin tersten yazilisi : " + kelime.charAt(3)
					+ kelime.charAt(2) + kelime.charAt(1) + kelime.charAt(0));
		} else {
			System.out.println("Char `li cozum \n4 harfli bir kelime girmelisiniz ");
		}

		System.out.println("\n\n\n");
		if (kelime.length() != 4) {
			System.out.println("substring`li cozum\n4 harfli bir kelime girmelisiniz ");
		} else {
			String tersKelime = kelime.substring(3, 4);
			tersKelime += kelime.substring(2, 3);
			tersKelime += kelime.substring(1, 2);
			tersKelime += kelime.substring(0, 1);
			System.out.println("substring`li cozum\ngirdiginiz kelimenin tersten yazilisi : " + tersKelime);
		}

		scan.close();

	}

}
