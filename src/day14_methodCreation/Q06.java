package day14_methodCreation;

import java.util.Scanner;

public class Q06 {

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int kisaKenar, uzunKenar, alan, cevre;
		System.out.print("Kýsa Kenar: ");
		kisaKenar = reader.nextInt();
		System.out.print("Uzun Kenar: ");
		uzunKenar = reader.nextInt();
		cevre = Cevre(kisaKenar, uzunKenar);
		System.out.println("Çevre = " + cevre);
		alan = Alan(kisaKenar, uzunKenar);
		System.out.println("Çevre = " + alan);
		
		reader.close();
	}

	public static int Cevre(int kk, int uk) {
		int cevre;
		cevre = (kk + uk) * 2;

		return cevre;
	}

	public static int Alan(int kk, int uk) {
		int alan;
		alan = kk * uk;

		return alan;
	}

}