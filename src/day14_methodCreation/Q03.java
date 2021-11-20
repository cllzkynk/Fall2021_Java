package day14_methodCreation;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Deðiþken Tanýmlamasý:
		double ilkdeger, ikincideger;
		String islem;
		System.out.println(
				"Ýki Sayý ile Dört Ýþlem\n----------\n1- Toplama Ýþlemi (+)\n2- Çýkartma Ýþlemi (-)\n3- Çarpma Ýþlemi (*)\n4- Bölme Ýþlemi (/)\n----------");
		System.out.print("Ýþlem Yapýlacak Ýlk Deðer: ");
		ilkdeger = scanner.nextDouble();
		System.out.print("Ýþlem Yapýlacak Ýkinci Deðer: ");
		ikincideger = scanner.nextDouble();
		System.out.print("----------\nYapacaðýnýz Ýþlem: ");
		islem = scanner.next();
		System.out.println("----------\nÝþlem Sonucu: " + hesapmakinesi(ilkdeger, ikincideger, islem));
		
		scanner.close();
	}

	// Metot Tanýmlamasý:
	public static double hesapmakinesi(double a, double b, String karar) {
		if (karar.equals("+") || karar.equals("1")) {
			return a + b;
		} else if (karar.equals("-") || karar.equals("2")) {
			return a - b;
		} else if (karar.equals("*") || karar.equals("3")) {
			return a * b;
		} else if (karar.equals("/") || karar.equals("4")) {
			return a / b;
		} else {
			return 0;
		}
	}
}
