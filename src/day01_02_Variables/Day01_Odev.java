package day01_02_Variables;

public class Day01_Odev {
	public static void main(String[] args) {

		// 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin.

		boolean winterIsComing = true;
		int yil = 2021;
		String sifre = "Ne kadar ekmek o kadar kofte";

		System.out.println("1.sorunun cevabi");

		System.out.println(winterIsComing);
		System.out.println(yil);
		System.out.println(sifre);

		System.out.println("===========================================================");

		// 2- isim ve soyisim icin iki variable olusturun ve bunlari yazdirin

		System.out.println("2.sorunun cevabi");

		String isim = "Celil";
		String soyIsim = "Ozkaynak";
		System.out.println("isminiz:  " + isim);
		System.out.println("Soyisminiz: " + soyIsim);

		System.out.println("===========================================================");
		// 3 iki farkli tam sayi data turunde 2 variable olusturun ve bunlari toplamini
		// yazdirin
		System.out.println("3.sorunun cevabi");
		int tam1 = 111111;
		long tam2 = 10000000000000000L;
		System.out.println(tam1 + tam2);

		System.out.println("===========================================================");

		// 4 bir tamsayi ve bir ondalikli variable olusturup bunlari toplayiniz
		System.out.println("3.sorunun cevabi");
		short sayi1 = 2000;
		float sayi2 = 100000.3f;

		System.out.println(sayi1 + sayi2);

		System.out.println("===========================================================");

		// 5 char data turunde bir variable olusturun ve yazdirin
		System.out.println("5.sorunun cevabi");
		char karakter1 = '#';
		System.out.println(karakter1);

		System.out.println("===========================================================");
		// 6 bir tamsayi ve bir char
																							
		// degiskeni olusturup
																							
		// bunlari toplayiniz

		// 6 bir tam sayi birde char variable olustur ve bunlari topla
		System.out.println("6.sorunun cevabi");
		byte sayiTam1 = 100;
		char karakter2 = '1';
		System.out.println(sayiTam1 + karakter2);

		// Guya 100 ile 1 i topladik ama 1 i tam sayi degil karakter olarak gorup ASCII
		// degerini aldigi icin sonuc 149 cikti

		byte sayi11 = 15;
		char next = 'Y';
		System.out.println(sayi11 + "" + next);

	}

}
