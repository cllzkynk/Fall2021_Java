package day17_forLoops;

import java.util.Scanner;

public class Q13ekok {
// girilen sayilarin ekokunu bulunuz 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi1: ");
		int bir = scan.nextInt();
		System.out.println("sayi2: ");
		int iki = scan.nextInt();
		int ekok = 1;
		// 10 ve 20 max 200 ekok 20

		int max = bir * iki;

		// ekok(a,b) max a.b

		for (int i = max; i > 0; i--) {
			if (i % bir == 0 && i % iki == 0) {
				ekok = i;
			}
		}
		System.out.println(ekok);

		scan.close();
	}
}
