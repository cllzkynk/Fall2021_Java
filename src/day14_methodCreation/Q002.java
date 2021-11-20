package day14_methodCreation;

import java.util.Scanner;

public class Q002 {

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
		
		kareler(sayi1 ,sayi2 );
		
		kupler(sayi1 ,sayi2);
		
		
		
		
	giris.close();	
		
	}

	public static void kareler(double sayi1, double sayi2) {
		System.out.println("Kareler toplami : " +(sayi1*sayi1+sayi2*sayi2));
		
	}

	public static void kupler(double sayi1, double sayi2) {
		
		System.out.println("Kupler toplami : " +(sayi1*sayi1*sayi1+sayi2*sayi2*sayi2));
	}

}
