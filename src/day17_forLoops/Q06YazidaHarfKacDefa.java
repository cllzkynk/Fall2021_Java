package day17_forLoops;

import java.util.Scanner;

public class Q06YazidaHarfKacDefa {
	public static void main(String[] args) {

		// Bir yaz� i�inde belirtilen bir karakterin ka� tane oldu�unu yazd�riniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Hadi gir bakalim bisiler");
		String cumle = scan.nextLine();
		char aranan = 'i';
		int tane = 0;

		for (int i = 0; i < cumle.length(); i++) {
			if (aranan == cumle.charAt(i)) {
				++tane;

			}
		}

		System.out.println(aranan + "  Girilen yazi icinde " + tane + " defa vardir");

		scan.close();
	}

}
