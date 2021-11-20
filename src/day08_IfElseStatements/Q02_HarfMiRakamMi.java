package day08_IfElseStatements;

import java.util.Scanner;

public class Q02_HarfMiRakamMi {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
		 * olmadigini yazdirin
		 */

		Scanner klavye = new Scanner(System.in); // Giriþ için Klavye instanse oluþturuyoruz.
													// Bunun adinin scan olmasi zorunlu degildi

		System.out.print("karakter giriniz:"); // Console da metin yazýyoruz. Ama karakter girmesini bekliyoruz.

		char c = klavye.nextLine().charAt(0); // char olarak bir harf veya sayý giriþi yapýyoruz.
												// karakter degil uzun bisi girebilir diye charAt(0) kullandim

		// ifler de koþullara uyarsa o blok çalýþacak.

		if (c >= 'A' && c <= 'Z')
			System.out.print("Büyük Harf" + " \" " + c + " \" " + "Girdiniz!");
		else if (c >= 'a' && c <= 'z')
			System.out.print("küçük harf" + " \" " + c + " \" " + "girdiniz!");
		else if (c >= '0' && c <= '9')
			System.out.print("sayý girdiniz=" + "\"" + c + "\"");
		else
			System.out.print("özel karakter girdiniz Girilen karakter = " + "\"" + c + "\"");
		klavye.close();
	}
}