package day17_forLoops;

import java.util.Scanner;

public class Q11carpimtablosu {
	// kullan�c� taraf�ndan girilen say�n�n �arp�m tablosunu olu�turunuz

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
