package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q08RakamlarToplami {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		 */
		Scanner giris = new Scanner(System.in);
		System.out.println(" tam sayi  gir");
		int num = giris.nextInt();
		int n = 0;
		while (num != 0) {

			n += num % 10;
			num /= 10;

		}
		System.out.println("Girilen sayinin rakamlar toplami : " + n);
		
		giris.close();
	}

}
