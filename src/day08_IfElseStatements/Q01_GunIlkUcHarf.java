package day08_IfElseStatements;

import java.util.Scanner;

public class Q01_GunIlkUcHarf {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise
		// gun
		// isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak
		// yazdirin, gun ismi
		// gecerli degilse “Gecerli gun ismi giriniz” yazdirin

		Scanner giris = new Scanner(System.in); // illa scan olmak zorunda degil

		System.out.println("Lutfen bir gun ismi giriniz:");

		String gun = giris.next().toUpperCase();

		if (gun.equals("PAZAR") || gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("SALÝ")
				|| gun.equals("CARSAMBA") || gun.equals("PERSEMBE") || gun.equals("CUMA") || gun.equals("CUMARTESI")
				|| gun.equals("CUMARTESÝ")) {

			System.out.println(gun.charAt(0) + "" + gun.toLowerCase().charAt(1) + "" + gun.toLowerCase().charAt(2));

		} else {

			System.out.println("Gecerli gun ismi giriniz");
		}

		giris.close();
	}

}