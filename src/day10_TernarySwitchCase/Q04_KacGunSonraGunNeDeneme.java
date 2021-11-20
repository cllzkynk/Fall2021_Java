package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q04_KacGunSonraGunNeDeneme {
	/*
	 * /* (Haftanýn günü) Kullanýcýdan bugüne karþýlýk gelen bir tam sayý (Pazar -
	 * 0, Pazartesi - 1, …, ve Cumartesi - 6 olacak þekilde) alan bir program
	 * yazýnýz. Ayný zamanda kullanýcýdan, “bugünden kaç gün sonra” için de bir tam
	 * sayý deðeri alarak, ona karþýlýk gelen günü gösteriniz
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun nosunu Pazar 0`dan baslayacak sekilde giriniz");
		int gunNo = scan.nextInt();
		int sonragun=0;
		String gunAdi = "";
		String xGunsonraAd="";
		switch (gunNo) {
		case 0:
			gunAdi = "Pazar";
			break;
		case 1:
			gunAdi = "Pazartesi";
			break;
		case 2:
			gunAdi = "Sali";
			break;
		case 3:
			gunAdi = "Carsamba";
			break;
		case 4:
			gunAdi = "Persembe";
			break;
		case 5:
			gunAdi = "Cuma";
			break;
		case 6:
			gunAdi = "Cumartes";
			break;

		default:
			System.out.println("Gecerli gun numarasi giriniz");

		}
		System.out.println(gunAdi);

		System.out.println("Kac gun gun sonrasinin hangi gun oldugunu merak ediyin ");
		int xGunsonra = scan.nextInt();

		sonragun = (gunNo + xGunsonra) % 7;
		
		switch (sonragun) {
		case 0:
			xGunsonraAd = "Pazar";
			break;
		case 1:
			xGunsonraAd = "Pazartesi";
			break;
		case 2:
			xGunsonraAd = "Sali";
			break;
		case 3:
			xGunsonraAd = "Carsamba";
			break;
		case 4:
			xGunsonraAd = "Persembe";
			break;
		case 5:
			xGunsonraAd = "Cuma";
			break;
		case 6:
			xGunsonraAd = "Cumartes";
			break;
			
		}
		
		System.out.println("Girilen gun nosu " +gunNo+ "  ve gunlerden " +gunAdi + ","+ xGunsonra+ " gun sonra gunlerden  "+xGunsonraAd + "  olcak");

	
	scan.close();
	}

}
