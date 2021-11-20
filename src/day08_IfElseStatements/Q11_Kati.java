package day08_IfElseStatements;

import java.util.Scanner;

public class Q11_Kati {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// Girilen sayý hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katý”,
		// sadece 2 ile bölünebiliyorsa “2’nin katý”,
		// sadece 3 ile bölünebiliyorsa “3’ün katý”,
		// ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katý deðil” mesajý veren program
		// yazin

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir tamsasyi giriniz");

		int sayi = input.nextInt();

		if (sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println("Girilen sayi 2 ve 3 un katidir");
		} else if (sayi % 2 == 0) {
			System.out.println("Girilen sayi 2 nin katidir");
		} else if (sayi % 3 == 0) {
			System.out.println("Girilen sayi 3 un katidir");
		} else {
			System.out.println("Girilen sayi 2 ve 3 un  katidi degildir");
		}

		input.close();
	}

}
