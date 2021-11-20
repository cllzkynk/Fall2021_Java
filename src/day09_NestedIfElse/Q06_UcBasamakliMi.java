package day09_NestedIfElse;

import java.util.Scanner;

public class Q06_UcBasamakliMi {
	// Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa
	// “Uc basamakli degil” yazdirin

	public static void main(String[] args) {

		Scanner memleketBartin = new Scanner(System.in); // Scanner`in ismini kafana gore koyabilirsin
		System.out.println("Lutfen bir tamsayi giriniz");

		if (memleketBartin.hasNextInt()) {
			int sayi = memleketBartin.nextInt();
			System.out.println(sayi > 99 && sayi < 1000 ? "Sayi uc basamaklidir" : "Sayi uc basamakli degil");

		} else {
			System.out.println("Sana tamsayi gir dedik demi :(");
		}

		memleketBartin.close();
	}

}
