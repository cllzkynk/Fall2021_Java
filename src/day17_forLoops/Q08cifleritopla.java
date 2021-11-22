package day17_forLoops;

import java.util.Scanner;

public class Q08cifleritopla {
//n  sayýya kadar olan tek sayýlarýn toplamýný yazdýriniz

	// tek ==> %2
	// if

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nereye kadar  gidek ");
		int ucBeyi = scan.nextInt();

		int toplam = 0;

		for (int i = 1; i <= ucBeyi; i++) {
			if (i % 2 != 0) {

				toplam += i;
			}

		}

		System.out.println(toplam);
		scan.close();
	}
}
