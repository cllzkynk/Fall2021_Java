package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q03_AyYilDEneme {
	/*
	 * (Bir ayýn gün sayýsý) Kullanýcýdan ay ve yýl bilgisini alan ve yýlýn bu ayýna
	 * ait gün sayýsýný gösteren bir program yazýnýz. Örneðin; kullanýcý ay için 2
	 * ve yýl için 2012 girerse, program “Þubat 2012, 29 gündür”(artik yil kontrolu)
	 * mesajýný gösterecek. Eðer kullanýcý ay için 3 ve yýl için 2015 girerse,
	 * program “Mart 2015, 31 gündür” mesajýný gösterecek.
	 */

	// System.out.println(""+ay+ " "+yil +" ,"+kacGunCeker+" "+"gundur");
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ay numarasini giriniz");
		int ayNo = scan.nextInt();
		System.out.println("Lutfen yili giriniz");
		int yil = scan.nextInt();
		String ayAd = "";
		int kacGunCeker = 0;

		switch (ayNo) {
		case 1:
			ayAd = "Ocak";
			break;
		case 2:
			ayAd = "Subat";
			break;
		case 3:
			ayAd = "mart";
			break;
		case 4:
			ayAd = "nisan";
			break;
		case 5:
			ayAd = "mayis";
			break;
		case 6:
			ayAd = "haziran";
			break;
		case 7:
			ayAd = "temmuz";
			break;
		case 8:
			ayAd = "agustos";
			break;
		case 9:
			ayAd = "eylul";
			break;
		case 10:
			ayAd = "ekim";
			break;
		case 11:
			ayAd = "kasim";
			break;
		case 12:
			ayAd = "aralik";
			break;

		default:
			System.out.println("Gecerli bir ay no giriniz"); ///an itibariyle ay ni ay isim elesti

		}

		if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {

			kacGunCeker = 29;

		} else {
			kacGunCeker = 28;  // ocak 

		} // buradaki if islemi subat`in basimiza actigi dert
		switch (ayNo) {
		/*case 2:
			kacGunCeker=kacGunCeker;
			break;*/
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			kacGunCeker = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			kacGunCeker = 30;
			break;

		}

		System.out.println(ayAd + " " + yil + " , " + kacGunCeker + "  gun ceker .");

		scan.close();
	}

}
