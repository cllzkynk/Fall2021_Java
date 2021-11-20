package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
	public static void main(String[] args) {

		// Kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan
		// method calissin

		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz\nSayi1 : ");
        
		try {

			if (scan.hasNextDouble()&&scan.next()!=null) {
				double sayi1 = scan.nextInt();
				System.out.println("Sayi2 : ");
				if (scan.hasNextDouble()) {
					double sayi2 = scan.nextInt();

					System.out.println("Kare icin 2 , Kup icin 3 girniz ");

					if (scan.hasNextInt()) {

						int us = scan.nextInt();

						if (us == 2) {
							kareler(sayi1, sayi2);
						} else if (us == 3) {
							kupler(sayi1, sayi2);
						} else {
							System.out.println("aciklamada ne yaziyo kardes 2 veya 3 giricen");
						}
					} else {
						System.out.println("aciklamada ne yaziyo kardes 2 veya 3 giricen");
					}
				} else {
					System.out.println("aciklamada sayi diyor emmi");
				}
			} else {
				System.out.println("aciklamada sayi diyor emmi");
			}

		} catch (Exception e) {
			System.out.println("Matematigide biz ogretmeyek artik haa");
		} 
	
		scan.close();

	} // main metod sonu

	public static void kupler(double sayi1, double sayi2) {
		System.out.println("Kupler toplami : " + (sayi1 * sayi1 * sayi1 + sayi2 * sayi2 * sayi2));

	}

	public static void kareler(double sayi1, double sayi2) {
		System.out.println("Kareler toplami : " + (sayi1 * sayi1 + sayi2 * sayi2));

	}
}// class sonu
