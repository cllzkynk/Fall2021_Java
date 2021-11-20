package day15_methodCreation;

import java.util.Scanner;

public class Q0001_PozitifNegatif {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini,100’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz ");
		int sayi = scan.nextInt();

		tekmi(sayi);
		pozitif(sayi);
		yuzeGore(sayi);
		
		scan.close();

	}

	public static void yuzeGore(int sayi) {
		
		System.out.println(sayi>100&& sayi<=999 ? sayi%10+(sayi/10)%10+(sayi/100):sayi%10);
	}

	public static void pozitif(int sayi) {
		System.out.println(sayi < 0 ? "Sayi negatif" : (sayi == 0) ? "Sifir poz. neg. olmaz" : "Sayi pozitif");

	}

	public static void tekmi(int sayi) {

		System.out.println(sayi % 2 == 0 ? "Sayi cifttir" : "sayi tektir");
		
		
	}

}
