package day17_forLoops;

import java.util.Scanner;

public class Q04_AmstrongSayi {

	public static void main(String[] args) {
		// Tüm basamaklarýndaki rakamlarýn sayý deðerlerinin küpleri toplamý,kendisine
		// eþit olan sayýlara “Armstrong sayý”denir.
		// 27+0+343+1= 370 == 3701

		// 3711

		Scanner scan = new Scanner(System.in);
		System.out.println("Deneme sayini gir");
		int sayi = scan.nextInt();
		int length = String.valueOf(sayi).length();

		int kalan = 0;
		int toplam = 0;

		int sayininEmenatcisi = 0;
		sayininEmenatcisi = sayi;

		for (int i = 0; i < length; i++) {
			kalan = sayi % 10;
			toplam = toplam + (int) Math.pow(kalan, length);
			sayi = sayi / 10;
		}

		if (sayininEmenatcisi == toplam) {
			System.out.println("Sayi Armstrong sayýdir ");

		} else {
			System.out.println("Sayi Armstrong sayý degildir ");
		}
		scan.close();
		
		
	}

}
