package day08_IfElseStatements;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ürün yasinizi  giriniz");
		int yas = scan.nextInt();
		int agirlik = scan.nextInt();

		if (yas >= 18) {
			if (agirlik > 50) {
				System.out.println("Kan baðýþýna uygunsunuz");
			} else {
				System.out.println("Kan baðýþýna uygun deðilsiniz");
			}
		} else {
			System.out.println("Yaþ 18'den büyük olmalýdýr");
		}
		scan.close();
	}
}