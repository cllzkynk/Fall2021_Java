package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q04_KacGunSonraGunNe {
	/*
	 * (Haftanýn günü) Kullanýcýdan bugüne karþýlýk gelen bir tam sayý (Pazar - 0,
	 * Pazartesi - 1, …, ve Cumartesi - 6 olacak þekilde) alan bir program yazýnýz.
	 * Ayný zamanda kullanýcýdan, “bugünden kaç gün sonra” için de bir tam sayý
	 * deðeri alarak, ona karþýlýk gelen günü gösteriniz
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun nosunu Pazar 0`dan baslayacak sekilde giriniz");
		int gunNo = scan.nextInt();
		String gun = "";
		String sonraGun = "";
		switch (gunNo) {
		case 0:
			gun = "Pazar";
			break;
		case 1:
			gun = "Pazartesi";
			break;
		case 2:
			gun = "Sali";
			break;
		case 3:
			gun = "Carsamba";
			break;
		case 4:
			gun = "Persembe";
			break;
		case 5:
			gun = "cuma";
			break;
		case 6:
			gun = "Camartesi";
			break;
		default:
			System.out.println("Lutfen sartta belirtilen dogrultuda giris yapiniz");
		}
		System.out.println("Kac gun sonrasini merak adiyon bakiim sen ");
		int XgunSonra = scan.nextInt();
		gunNo = (gunNo + XgunSonra ) % 7;

		switch (gunNo) {
		case 0:
			sonraGun = "Pazar";
			break;
		case 1:
			sonraGun = "Pazartesi";
			break;
		case 2:
			sonraGun = "Sali";
			break;
		case 3:
			sonraGun = "Carsamba";
			break;
		case 4:
			sonraGun = "Persembe";
			break;
		case 5:
			sonraGun = "cuma";
			break;
		case 6:
			sonraGun = "Camartesi";
			break;
		default:
			System.out.println("Lutfen sartta belirtilen dogrultuda giris yapiniz");
		}
System.out.println("Girilen gun " + gun + " ve " + XgunSonra + " sonra gunlerden " + sonraGun + "  Olacak insALLAH");

scan.close();
	}

}
