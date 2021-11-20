package day14_methodCreation;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin

		
		Scanner giris = new Scanner(System.in);
		System.out.println("Sirayla iki sayi giriniz\nSayi1 : ");
		double sayi1=giris.nextDouble();
		System.out.println("Sayi2 : ");
		double sayi2=giris.nextDouble();
		
		double kare= kareler(sayi1 ,sayi2 );
		
		double kup = kupler(sayi1 ,sayi2);
		
		//double kare=kareler(sayi1,sayi2);
		System.out.println(kare);
		
		//double kup=kupler(sayi1, sayi2);
		System.out.println(kup);
		
		
	giris.close();
		
	}

	public static double kareler(double sayi1, double sayi2) {
		double karelertoplami=sayi1*sayi1+sayi2*sayi2;
		
		return karelertoplami;
		
		
	}

	public static double kupler(double sayi1, double sayi2) {
		double kuplertoplami=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
		return kuplertoplami;
	}

}
