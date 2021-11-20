package day08_IfElseStatements;

import java.util.Scanner;

public class Q13BasamakDegerleriYazdir {
	/* Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
	 * ve yuzler basamagi olarak yazdirin
	 * Ornek : Inputs : 853 Output : Girdiginiz sayinin birler basamagi : 3
	 * Girdiginiz sayinin onlar basamagi : 5 Girdiginiz sayinin yuzler basamagi : 8 */

	public static void main(String[] args) {

		

		Scanner input = new Scanner(System.in);

		System.out.println("Lutfen uc basamakli bir sayi giriniz");
		int sayi = input.nextInt();

		int yuzler = sayi / 100, onlar = sayi / 10 % 10, birler = sayi % 10;

		// System.out.println(yuzler + " " + onlar + " " + birler);

		if (sayi > 99 && sayi < 1000) {
			System.out.println("Girdiginiz sayinin;\n\t\tbirler basamagi : " + birler);
			System.out.println("\n\t\tonlar basamagi  : " + onlar);
			System.out.println("\n\t\tyuzler basamagi : " + yuzler);
		} else {
			System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		}

		input.close();

	}

}
