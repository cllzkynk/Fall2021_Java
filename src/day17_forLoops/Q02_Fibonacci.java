package day17_forLoops;

import java.util.Scanner;

public class Q02_Fibonacci {

	public static void main(String[] args) {
		// n'nin kullanýcý tarafýndan girildiði n terimli Fibonacci serisini yazdýran
		// bir program yazýn :
		// 0 1 1 2 3 5 8 13 21 .....

		Scanner scan = new Scanner(System.in);
		System.out.println("Terim sayisini gir");
		int terimSayisi = scan.nextInt();

		int ilkTerim = 0;
		int ikinciTerim = 1;
		int ucuncuTerim = 0;

		System.out.print(ilkTerim + " " + ikinciTerim + " ");
		for (int i = 3; i <= terimSayisi; i++) {
			ucuncuTerim = ilkTerim + ikinciTerim;

			System.out.print(ucuncuTerim + " ");

			ilkTerim = ikinciTerim;
			ikinciTerim = ucuncuTerim;
			
		}

		scan.close();
	}

}
