package day09_NestedIfElse;

import java.util.Scanner;

public class Q03_MutlakDeger {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi = input.nextDouble();

		System.out.println(sayi < 0  ? "Girilen sayinin mutlak degeri : " + (sayi * (-1))
				: "Girilen sayinin mutlak degeri : " + sayi);

	/*	if (sayi < 0) {

			System.out.println("Girilen sayinin mutlak degeri : " + (sayi * (-1)) + "  ifli calisti ");
		} else {
			System.out.println("Girilen sayinin mutlak degeri : " + sayi + "  ifli calisti ");
		} */

		input.close();
	}

}
