package day08_IfElseStatements;

import java.util.Scanner;

public class Q02_HarfMiRakamMi {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
		 * olmadigini yazdirin
		 */

		Scanner klavye = new Scanner(System.in); // Giri� i�in Klavye instanse olu�turuyoruz.
													// Bunun adinin scan olmasi zorunlu degildi

		System.out.print("karakter giriniz:"); // Console da metin yaz�yoruz. Ama karakter girmesini bekliyoruz.

		char c = klavye.nextLine().charAt(0); // char olarak bir harf veya say� giri�i yap�yoruz.
												// karakter degil uzun bisi girebilir diye charAt(0) kullandim

		// ifler de ko�ullara uyarsa o blok �al��acak.

		if (c >= 'A' && c <= 'Z')
			System.out.print("B�y�k Harf" + " \" " + c + " \" " + "Girdiniz!");
		else if (c >= 'a' && c <= 'z')
			System.out.print("k���k harf" + " \" " + c + " \" " + "girdiniz!");
		else if (c >= '0' && c <= '9')
			System.out.print("say� girdiniz=" + "\"" + c + "\"");
		else
			System.out.print("�zel karakter girdiniz Girilen karakter = " + "\"" + c + "\"");
		klavye.close();
	}
}