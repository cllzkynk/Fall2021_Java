package day14_methodCreation;

import java.util.Scanner;

public class Q05 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		double yazili1, yazili2, sonuc;
		System.out.print("1. Yazýlý: ");
		yazili1 = reader.nextDouble();
		System.out.print("2. Yazýlý: ");
		yazili2 = reader.nextDouble();
		sonuc = Ortalama(yazili1, yazili2);
		System.out.println("Ortalama = " + sonuc);
		reader.close();
	}

	public static double Ortalama(double y1, double y2) {
		double ortalama;
		ortalama = (y1 + y2) / 2;

		return ortalama;
	}

}