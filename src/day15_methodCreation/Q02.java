package day15_methodCreation;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre - @
		 * isareti icermiyorsa gecersiz email yazdirin - @gmail.com icermiyorsa
		 * "lutfen gmail adresinizi girin" yazdirin - @gmail.com ile bitmiyorsa
		 * "Yazimda bir sorun var, maili kontrol ediniz"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen email adresinizi yazýnýz");
		String email = scan.next();
		// kontrolET(email);
		// kontrolicerme(email);
		// kontrolBitis(email);

		if (kontrolET(email) == "" && kontrolicerme(email) == "" && kontrolBitis(email) == "") {
			System.out.println("Sifreniz basariyla kaydedildi");
		} else {
			System.out.println(kontrolET(email) + " " + kontrolicerme(email) + " " + kontrolBitis(email));
		}

		scan.close();

	}

	public static String kontrolBitis(String email) {
		String flag;
		if (email.endsWith("@gmail.com")) {
			flag = "";
		} else {
			flag = "Yazimda bir sorun var, maili kontrol ediniz";
		}
		return flag;

	}

	public static String kontrolicerme(String email) {
		String flag;
		if (email.contains("@gmail.com")) {
			flag = "";
		} else {
			flag = "lutfen gmail adresinizi girin";
		}
		return flag;

	}

	public static String kontrolET(String email) {
		String flag;
		if (email.contains("@")) {
			flag = "";

		} else {
			flag = "gecersiz email @ icermeyen mail mi olur";
		}
		return flag;

	}

}
