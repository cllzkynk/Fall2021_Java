package day13_stringManipulations;

import java.util.Scanner;

public class Q08_KelimeninOrtasinaKelimeYerlestirme {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("Bisiler girin");
		 * String str = scan.nextLine();
		 * 
		 * int tekteYari = str.length() / 2;
		 * 
		 * if (str.length() % 2 == 0) { System.out.println(str.substring(str.length() /
		 * 2, str.length())); // yaridan odesini alir
		 * System.out.println(str.substring(0, str.length() / 2)); // ilk yariyi alir }
		 * else { System.out.println(str.substring(tekteYari)); // yaridan otesini
		 * System.out.println(str.substring(0, tekteYari));
		 * 
		 * } scan.close();
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki isim giriniz\nIsim1 :");
		String name1 = scan.next();
		System.out.println("Isim2:  ");
		String name2 = scan.next();
		int OrtaBul;

		if (name1.length() % 2 == 1) {
			 OrtaBul = name1.length() / 2 ;
			 System.out.println(name1.substring(0, OrtaBul) + name2 + name1.substring(OrtaBul+1));	
		} else {
		OrtaBul = name1.length() / 2;
		System.out.println(name1.substring(0, OrtaBul) + name2 + name1.substring(OrtaBul));
		}

		

		scan.close();

	}

}
