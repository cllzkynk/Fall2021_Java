package day10_TernarySwitchCase;

import java.lang.Math;

import java.util.Scanner;

public class Q02_Piyango {

	public static void main(String[] args) {
		/*
		 * (Oyun: piyango) Madde 3.8 Lottery.java �y� yeniden d�zenleyerek �� basamakl�
		 * say�lardan bir piyango olu�turun. Program kullan�c�dan �� basamakl� bir say�
		 * als�n ve a�a��daki kurallara g�re kazanc�n� g�stersin: 1. E�er girilen say�
		 * piyangoda kazanan say� ile birebir ayn�s� ise; �d�l 10 000 TL 2. E�er girilen
		 * say�n�n t�m basamaklar� piyangoda kazanan say� ile ayn� ise; �d�l 3 000 TL 3.
		 * E�er girilen say�n�n bir basama�� piyangoda kazanan say� ile ayn� ise; �d�l 1
		 * 000 TL
		 */

		int random = (int) (Math.random() * (899) + 100);
		// System.out.println("Random sayimiz : " + random);

		// int random = 517;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir tam sayi giriniz");
		if (scan.hasNextInt()) {
			int tahmin = scan.nextInt();
			if (99 < tahmin && tahmin < 1000) {

				int t1 = tahmin / 100;
				int t2 = (tahmin / 10) % 10;
				int t3 = tahmin % 10;
				int r1 = random / 100;
				int r2 = (random / 10) % 10;
				int r3 = random % 10;
				System.out.println("\ntahmin sayibasamaklari \n\n" + t1 + "\t" + t2 + "\t" + t3);
				System.out.println("\nrandom sayi basamaklari \n\n" + r1 + "\t" + r2 + "\t" + r3 + "\n");

				if (tahmin == random) {
					System.out.println("Tebrikler 10000 TL odul kazandiniz");
				} else if (t1 == r1 && t3 == r2 && t2 == r3 ||            // a==>t1 b==>t1 c==>t3 //x==>r1 y==>r2 z==>r3					    	t2 == r1 && t1 == r2 && t3 == r3 ||               // t1t2t3 //r1r2r3
						   t2 == r1 && t3 == r2 && t1 == r3 ||
						   t3 == r1 && t1 == r2 && t2 == r3|| 
						   t3 == r1 && t2 == r2 && t1 == r3)
				{
					System.out.println("Tebrikler 3000 TL odul kazandiniz");
				} else if (t1 == r1 || t1 == r2 || t1 == r3 || t2 == r1 || t2 == r2 || t2 == r3 || t3 == r1 || t3 == r2
						|| t3 == r3) {
					System.out.println("Tebrikler 1000 TL odul kazandiniz");
				} else {
					System.out.println("Sanssizlik ... Lutfen tekrar deneyiniz");
				}

			} else {
				System.out.println(" Tekrar dene.. Bizim yazana kadar gobegimiz catliyo sen dalga geciyon"
						+ " .cabucak 3 basamakli bir tam sayi gir");
			}

		} else {
			System.out.println("Tamsayi giriniz");

		}
		scan.close();

	}
}
