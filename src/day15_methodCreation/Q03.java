package day15_methodCreation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("ismini gir");
		String isim = scan.nextLine();

		System.out.println("soyismini gir");
		String soyisim = scan.nextLine();

		System.out.println("16 haneli kart numarani gir");
		String kartno = scan.nextLine(); // ayirmak icin string metodlar isime yara diye string aldim 

		isimlerDuzelt(isim, soyisim);

		kartnoDuzelt(kartno);

		String isimlerMiss = isimlerDuzelt(isim, soyisim); // kullan dedigi icin bos bos bi kullanam dedim

		String kartnoMiss = kartnoDuzelt(kartno); // kullan dedigi icin bos bos bi kullanam dedim

		System.out.println(isimlerMiss + "\n" + kartnoMiss);
		scan.close();
	}

	public static String kartnoDuzelt(String kartno) {
		kartno = kartno.substring(0, 4) + " " + kartno.substring(4, 8) + " " + kartno.substring(8, 12) + " "
				+ kartno.substring(12);

		return kartno;

	}

	public static String isimlerDuzelt(String isim, String soyisim) {
		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

		return isim + " " + soyisim;

	}

}
