package day17_forLoops;

import java.util.Scanner;

public class Q203e5e15eBolunenler {
	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen
		// sayiya kadar
		// 3’un kati olan sayilari yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi gir ");
		int sayi = scan.nextInt();

		System.out.println("\nHem 3`e hem 5`e bolunenler");
		for (int i = sayi; i >= 1; i--) {
			if (i % 15 == 0) {
				System.out.print(i + ", ");

			}

		}
		System.out.println("\n\n");
		System.out.println(" 5`e bolunenler");
		System.out.println(".............................");
		for (int i = sayi; i >= 1; i--) {
			if (i % 5 == 0) {
				System.out.print(i + ", ");

			}

		}
		
System.out.println("\n\n");
		System.out.println(" 3`e bolunenler");
		System.out.println(".............................");
		for (int i = sayi; i >= 1; i--) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
		
		
	}

}
		scan.close();
	}
}
