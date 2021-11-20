package day08_IfElseStatements;

import java.util.Scanner;

public class Q09HarfMiKarakterMi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir karakter  giriniz");
		char karakter = scan.next().charAt(0);
		if (Character.isDigit(karakter))
			System.out.print("Rakamdýr");
		else if (Character.isLetter(karakter))
			System.out.print("Harftir");
		else
			System.out.print("Harf veya rakam deðil");

		scan.close();
	}

}
