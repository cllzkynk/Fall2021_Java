package day15_methodCreation;

import java.util.Scanner;

public class Q0003_MailKontrol {

	public static void main(String[] args) {
		/*
		 * Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
		 * 
		 * - @ isareti icermiyorsa gecersiz email yazdirin - @gmail.com icermiyorsa
		 * "lutfen gmail adresinizi girin" yazdirin - @gmail.com ile bitmiyorsa
		 * "Yazimda bir sorun var, maili kontrol ediniz"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen email adresinizi yaziniz");

		String mail = scan.next();

		EtvarMi(mail);
		gmContain(mail);
		gmSondaMi(mail);
		etKonumu(mail);
		gmailcomKonumu(mail);

		if (EtvarMi(mail) == "" && gmContain(mail) == "" && gmSondaMi(mail) == "" && etKonumu(mail) == ""
				&& gmailcomKonumu(mail) == "") {
			System.out.println("Mailiniz basariyla kaydedildi");
		} else {
			System.out.println("Mailde hata var");
			System.out.println(EtvarMi(mail) + "  " + gmContain(mail) + "  " + gmSondaMi(mail) + "  " + etKonumu(mail)
					+ "  " + gmailcomKonumu(mail));
		}

		scan.close();
	} /// main sonu

	public static String gmailcomKonumu(String mail) {
		String flag = "";
		if (mail.indexOf("@") == (mail.length() - 10)) {
			flag = "";
		} else {
			flag = "@`i dogru yere koydugunuzdan emin olunuz";
		}
		return flag;

	}

	public static String etKonumu(String mail) {
		String flag = "";
		if (mail.indexOf("@gmail.com") == (mail.length() - 10)) {
			flag = "";
		} else {
			flag = "@gmail.com`un yerinden emin olunuz emin olunuz";
		}

		return flag;
	}

	public static String EtvarMi(String mail) {
		String flag = "";
		if (mail.contains("@")) {
			flag = "";
		} else {
			flag = "Mail @ isareti icermelidir";
		}
		return flag;
	}

	public static String gmContain(String mail) {
		String flag = "";
		if (mail.contains("@gmail.com")) {
			flag = "";
		} else {
			flag = "Mail @gmail.com icermelidir";
		}
		return flag;
	}

	public static String gmSondaMi(String mail) {
		String flag = "";
		if (mail.endsWith("@gmail.com")) {
			flag = "";
		} else {
			flag = "Mail @gmail.com ile bitmelidir";
		}

		return flag;
	}

}
