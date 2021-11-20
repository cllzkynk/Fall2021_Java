package day14_methodCreation;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// De�i�ken Tan�mlamas�:
		double ilkdeger, ikincideger;
		String islem;
		System.out.println(
				"�ki Say� ile D�rt ��lem\n----------\n1- Toplama ��lemi (+)\n2- ��kartma ��lemi (-)\n3- �arpma ��lemi (*)\n4- B�lme ��lemi (/)\n----------");
		System.out.print("��lem Yap�lacak �lk De�er: ");
		ilkdeger = scanner.nextDouble();
		System.out.print("��lem Yap�lacak �kinci De�er: ");
		ikincideger = scanner.nextDouble();
		System.out.print("----------\nYapaca��n�z ��lem: ");
		islem = scanner.next();
		System.out.println("----------\n��lem Sonucu: " + hesapmakinesi(ilkdeger, ikincideger, islem));
		
		scanner.close();
	}

	// Metot Tan�mlamas�:
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
