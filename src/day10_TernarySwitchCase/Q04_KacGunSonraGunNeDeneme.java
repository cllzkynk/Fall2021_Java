package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q04_KacGunSonraGunNeDeneme {
	/*
	 * /* (Haftan�n g�n�) Kullan�c�dan bug�ne kar��l�k gelen bir tam say� (Pazar -
	 * 0, Pazartesi - 1, �, ve Cumartesi - 6 olacak �ekilde) alan bir program
	 * yaz�n�z. Ayn� zamanda kullan�c�dan, �bug�nden ka� g�n sonra� i�in de bir tam
	 * say� de�eri alarak, ona kar��l�k gelen g�n� g�steriniz
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
