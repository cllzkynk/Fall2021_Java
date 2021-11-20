package day15_methodCreation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini, 100’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");

		int sayi = scan.nextInt();

		pozitifNegatif(sayi); // girilen sayi argumentinin pozitif yada negatif oldugunu yazdirsin

		tekMiCiftMi(sayi);

		if (sayi >100) {
			yuzdenBuyuk(sayi);
		} else if (sayi < 100 && sayi >= 10) {
			yuzdenKucuk(sayi);
		} else if (sayi > 0 && sayi < 10) {
			tekRakam(sayi);
		} else if (sayi == 0) {
			SifiraEsit(sayi);
		} else {
			sifirdanKucuk(sayi);
		}

		// int a = yuzdenBuyuk(sayi);
		// System.out.println(a);

		scan.close();
	}

	public static void tekRakam(int sayi) {
		System.out.println("Sayi tek rakam ve birler basamagi yine kendisi olur \nBirler basamasgi : " + sayi);

	}

	public static void SifiraEsit(int sayi) {
		System.out.println("sayi sifira esit ve rakamlar toplamindan soz edilemez");

	}

	public static void sifirdanKucuk(int sayi) {
		sayi = sayi * (-1);
		System.out.println("Girilen sayi 100`den kucuk ve birler basamagi : " + sayi % 10);
	}

	public static void yuzdenKucuk(int sayi) {
		System.out.println("Girilen sayi yuzden kucuk ve birler basamagi: " + sayi % 10);

	}

	public static int yuzdenBuyuk(int sayi) { // 523
		int rakamlarToplami = 0;
		rakamlarToplami = sayi % 10 + ((sayi / 10)) % 10 + ((sayi / 100));

		System.out.println("Girilen sayi yuzden buyuk ve rakamlar toplami : " + rakamlarToplami);

		return rakamlarToplami;

	}

	public static void tekMiCiftMi(int sayi) {

		if (sayi % 2 == 0) {
			System.out.println("sayi cift");
		} else {
			System.out.println("sayi tek");
		}

	}

	public static void pozitifNegatif(int sayi) { // parametre yazarken data tipinide yazmaliyiz

		System.out.println(sayi > 0 ? "Girilen sayi pozitif"
				: (sayi < 0 ? "Girilen sayi negatif" : "Girilen sayi pozitif yada negatif degil"));
	}

}
