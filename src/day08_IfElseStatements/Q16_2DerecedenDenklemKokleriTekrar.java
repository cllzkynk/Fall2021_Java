package day08_IfElseStatements;

import java.util.Scanner;

public class Q16_2DerecedenDenklemKokleriTekrar {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("ax^2+bx+c seklindeki denklemin istenen degerlerinin asagiya giriniz \na :");
		a = giris.nextDouble();
		System.out.println("b: ");
		b = giris.nextDouble();
		System.out.println("c: ");
		c = giris.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Reel kok yoktur");
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("Delta sifira esit ve x1=x2 olur  " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("X1 :" + x1);
			System.out.println("X2 :" + x2);
		}

		giris.close();
	}
}
