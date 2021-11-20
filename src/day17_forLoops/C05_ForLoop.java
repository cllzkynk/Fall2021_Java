package day17_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
public static void main(String[] args) {
		// 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		// tamsayilari toplayip, sonucu yazdiran bir program yaziniz
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 2 pozitif tamsayi giriniz");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int toplam = 0;
		if (sayi1 > sayi2) {

			for (int i = sayi1; i >= sayi2; i--) {
				// System.out.print(i + " "); aradaki sayilarida gormek istersek 

				toplam += i;
				//System.out.println(toplam);
			}
			System.out.println(toplam);
		} else { // sayi1<=sayi2

			for (int i = sayi1; i <= sayi2; i++) {
				// System.out.print(i + " "); aradaki sayilarida gormek istersek 

				toplam += i;
				
			} 
			System.out.println(toplam);
			}	scan.close();	}}
