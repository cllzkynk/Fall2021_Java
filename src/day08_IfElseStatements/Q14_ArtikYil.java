package day08_IfElseStatements;

import java.util.Scanner;

public class Q14_ArtikYil {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Kontrol edilecek yili giriniz");

		int year = scan.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Artik yil");
		} else {
			System.out.println("olmadi be haci");
		}
		
		scan.close();
	}
}