package day09_NestedIfElse;

import java.util.Scanner;

public class Q05_KaremiDegilMi {

	public static void main(String[] args) {
		/*
		 * Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen
		 * degerlere gore dikdorgenin kare olup olmadigini yazdirin.
		 */

		Scanner celil=new Scanner (System.in);
		System.out.println("Dikdortgenin uzunlugunu ve genisligini giriniz \nUzunluk : ");
		double uzunluk=celil.nextDouble();
		System.out.println("Genislik : ");
		double genislik=celil.nextDouble();
		
		System.out.println(uzunluk==genislik? "Girilen degerlere gore dikdortgeniniz karedir" : "Dikdortgeniniz kare degildir" );
		
			celil.close();
	}

}
