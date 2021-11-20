package day17_forLoops;

import java.util.Scanner;

public class Q01_UsYazma {

	public static void main(String[] args) {
		/*
		 * Klavyeden iki sayý girilir. Bir sayýnýn diðerinin kuvvetine yükseltilmiþ
		 * deðerini bulan bir program yazýn. (Yerleþik Java yöntemini kullanmayýn)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Taban olacak sayiyi gir");
		int taban = scan.nextInt();
		System.out.println("Us olacak sayiyi gir");
		int us = scan.nextInt();
		int sonuc = 1;

		// taban 3
		// us 4
		// 3x3x3x3=81

		for (int i = 1; i <= us; i++) {
			sonuc *= taban; // i=1 icin =3
			               // i=2   3x3
							//i=3   9x3
						 //i=4 27x3
           System.out.print(taban+"*");
		}
		System.out.println("="+sonuc);

		scan.close();
	}

}
