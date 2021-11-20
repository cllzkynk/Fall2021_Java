package day08_IfElseStatements;

import java.util.Scanner;

public class Q11_Kati {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// Girilen say� hem 2 ile hem de 3 ile tam b�l�nebiliyorsa �2 ve 3��n kat��,
		// sadece 2 ile b�l�nebiliyorsa �2�nin kat��,
		// sadece 3 ile b�l�nebiliyorsa �3��n kat��,
		// ne 2�ye ne de 3�e b�l�nm�yorsa �2 veya 3��n kat� de�il� mesaj� veren program
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
