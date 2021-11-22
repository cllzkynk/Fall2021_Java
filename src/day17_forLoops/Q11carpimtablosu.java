package day17_forLoops;

import java.util.Scanner;

public class Q11carpimtablosu {
	// kullanýcý tarafýndan girilen sayýnýn çarpým tablosunu oluþturunuz

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("kaclari istiyon");
		int kaclar = scan.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "  *  " + kaclar + "  =  " + i * kaclar);

		}

		scan.close();

	}

}
