package day08_IfElseStatements;

import java.util.Scanner;

public class Q04_ArtikYil {

	public static void main(String[] args) {
		/*
		 * Soru 9) Interview Question Kullanicidan artik yil olup olmadigini kontrol
		 * etmek icin yil girmesini isteyin. Kural 1: 4 ile bolunemeyen yillar artik yil
		 * degildir Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir Kural
		 * 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati
		 * olan yillar artik yildir
		 */

		Scanner input = new Scanner(System.in); // scan ismi zorunlu degil neticede :D
		System.out.println("Lutfen Artik yil kontrolu icin bir yil giriniz");
		int yil = input.nextInt();

		if (yil % 4 == 0) {

			if (yil % 100 == 0 && yil % 400 == 0) {

				System.out.println("Girilen yil : " + yil + "  ve  " + yil + "  artik yildir");

			} else {
				System.out.println("Girilen yil artik yil degildir");
			}

		} else {
			System.out.println("Girilen yil artik yil degildir");
		}

		input.close();

	}

}
