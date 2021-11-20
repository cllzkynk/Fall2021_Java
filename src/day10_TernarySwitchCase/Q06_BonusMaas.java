package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q06_BonusMaas {

	public static void main(String[] args) {
		/*
		 * bir sirket calisanlarina %5 bonus vermeye karar vermistir. 5 yildan fazla
		 * hizmeti olanlara yil basina %5 bonus verecek. kullaniciya maasini ve hizmet
		 * yilini sorun ve net bonus miktarini yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"                           𝓜𝓔𝓡𝓗𝓐𝓑𝓐                           "
				+ "\nBonus kazanma durumunuzu gormek icin sirasiyla maasinizi ve hizmet yilinizi giriniz \nMaas : ");
		if (scan.hasNextDouble()) {//scan.hasNextDouble() bize girilen degerin double olacagini garanti ediyor. Harf giremez mesela.
			                      //bunu scan.hasNextInt() veye byte vb seklinde de kullanabilirsiniz.
			                       // bunu if icini koyarak girilen deger double mi diye if liyoruz double ise atamani yap islemlere devam et 
			                       // degilse bu if in else sine yanlis giris mesaji cakabiliriz
			                        // sizde bu if in else kismini yanlis giris mesajini goreceksiniz
			double maas = scan.nextDouble();
			if (maas > 0) {
				System.out.println("Lutfen hizmet yilinizi giriniz");
				if (scan.hasNextByte()) {
					byte hizmetYili = scan.nextByte();
					if (hizmetYili >= 0) {
						if (hizmetYili > 5) {
							System.out.println("Tebrikler Bonus almaya sartlariniz uygun gorunuyor.\n" + hizmetYili
									+ " yillik hizmetiniz karsiliginda " + maas * (hizmetYili - 5) * 0.05
									+ " USD Bonus kazandiniz");
						} else {
							int kacYilEksik = 5 - hizmetYili;
							System.out.println("Hizmette bes yilinizi doldurmamissiniz. " + kacYilEksik
									+ " yil sonra size de bonus vermek icin sabirsizlaniyoruz."); // hizmet yili 5 ten
																									// kucukse bonus
																									// kazanamama if i
																									// sonu
						}

					} else { // Hizmet yili yanlis girilme durumu if i sonu
						System.out.println("Ise gelecekte baslayacak olamazsiniz degil mi :)");
					}

				} else {
					System.out.println("Lutfen gecerli bir hizmet yili giriniz");// hizmet yili double mi kontrolu if
																					// sonu
				}
			} else {
				System.out.println("Ucret almadan calisiyor olamazsin degil mi :)");
			} // maasi pozitifmi kontrolu if sonu
		} else {// maasini alirkenki if hasnextdouble ifinin sonu
			System.out.println("Lutfen Gecerli bir maas giriniz");
		}
		scan.close();
	} // main method sonu

}// class sonu
