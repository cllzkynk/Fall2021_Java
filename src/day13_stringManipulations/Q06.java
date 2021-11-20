package day13_stringManipulations;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		 * sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem
		 * basarisiz,Lutfen yeni bir sifre girin” yazdirin - Ilk harf buyuk harf olmali
		 * - Son harf kucuk harf olmali - Sifre bosluk icermemeli - Sifre uzunlugu en az
		 * 8 karakter olmali
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		String password = scan.nextLine();

		if ('A' <= password.charAt(0) && password.charAt(0) <= 'Z' && 'a' <= password.charAt(password.length() - 1)
				&& password.charAt(password.length() - 1) <= 'z' && !password.contains(" ") && password.length() >= 8) {
			System.out.println("Sifre basari ile tanimlandi");
		} else {
			System.out.println(" basarisiz,Lutfen yeni bir sifre girin");
		}
		
		
		
		scan.close();
	}

}
