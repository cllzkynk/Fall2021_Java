package day08_IfElseStatements;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�r�n yasinizi  giriniz");
		int yas = scan.nextInt();
		int agirlik = scan.nextInt();

		if (yas >= 18) {
			if (agirlik > 50) {
				System.out.println("Kan ba����na uygunsunuz");
			} else {
				System.out.println("Kan ba����na uygun de�ilsiniz");
			}
		} else {
			System.out.println("Ya� 18'den b�y�k olmal�d�r");
		}
		scan.close();
	}
}