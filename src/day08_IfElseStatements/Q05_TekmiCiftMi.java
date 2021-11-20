package day08_IfElseStatements;

import java.util.Scanner;

public class Q05_TekmiCiftMi {

	public static void main(String[] args) {

		// Kullanicidan bir sayi isteyin ve sayinin tek veya cift sayi oldugunu yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi tam sayi giriniz");

		int sayi = scan.nextInt();

		// 153 % 2 == 0 sayi cift
		// 153 % 2 == 1 sayi tek

		if (sayi % 2 == 0) {
			System.out.println("girdiginiz sayi cift sayidir");
		}

		if (sayi % 2 == 1 || sayi % 2 == -1) {
			System.out.println("girdiginiz sayi tek sayi");
		}

		System.out.println("katildiginiz icin tesekkur ederiz");

		scan.close();
	}

}
