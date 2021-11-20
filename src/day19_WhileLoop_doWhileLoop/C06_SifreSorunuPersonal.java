package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_SifreSorunuPersonal {

	public static void main(String[] args) {
		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki
		 * sartlara gore kontrol edin ve sifredeki hatalari yazdirin. Kullanici gecerli
		 * bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
		 * “Sifreniz Kabul edilmistir” yazdirin. - Sifre kucuk harf icermelidir - Sifre
		 * buyuk harf icermelidir - Sifre ozel karakter icermelidir - Sifre en az 8
		 * karakter olmalidir.
		 */

		Scanner scan = new Scanner(System.in);
		int sonuc = 0; // 1 1 1 1=4
         // 0 lar false 1 ler true
		do {
			System.out.println("Sifre gir");
			String sifre = scan.nextLine();
			sonuc = Uzunluk(sifre) + Ozel(sifre) + Kucuk(sifre) + Buyuk(sifre);
          System.out.println("Sonuc :" + sonuc);
		} while (sonuc != 4); // eger 4 se hepsinden 1 return olmustur 23 satirdaki toplama 4 etmeli;

		System.out.println("Sifreniz basarili bir sekilde kaydedildi");
		
		
		scan.close();

	}

	public static int Uzunluk(String sifre) {
		int uzkotrol = 0;
		if (sifre.length() < 8) {
			System.out.println("Sifre en az 8 karakter olmalidir");
		} else {
			uzkotrol = 1;
		}

		return uzkotrol;
	}

	public static int Ozel(String sifre) {
		int ozkontrol = 0;
		int Ozsayici = 0;
		while (Ozsayici < sifre.length()) {
			if (sifre.charAt(Ozsayici) > 33 && sifre.charAt(Ozsayici) < 46) {
				ozkontrol = 1;
			}

			Ozsayici++;
		}

		if (ozkontrol == 0) {
			System.out.println("Sifre ozel karakter icermelidir");
		}

		return ozkontrol;
	}

	public static int Buyuk(String sifre) {
		int bukontrol = 0;
		int buSayici = 0;
		while (buSayici < sifre.length()) {
			if (sifre.charAt(buSayici) >= 'A' && sifre.charAt(buSayici) <= 'Z') {
				bukontrol = 1;
			}
			buSayici++;

		}
		if (bukontrol == 0) {
			System.out.println("Sifre kucuk harf icermelidir");
		}

		return bukontrol;
	}

	public static int Kucuk(String sifre) {
		int kukontrol = 0;
		int kuSayici = 0;
		while (kuSayici < sifre.length()) {
			if (sifre.charAt(kuSayici) >= 'a' && sifre.charAt(kuSayici) <= 'z') {
				kukontrol = 1;
			}
			kuSayici++;

		}
		if (kukontrol == 0) {
			System.out.println("Sifre kucuk harf icermelidir");
		}

		return kukontrol;
	}

}
