package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q05_SayininOkunusuDeneme {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc basamakli bir sayi giriniz");

		int number = scan.nextInt();

		int yuzler = number / 100, onlar = number / 10 % 10, birler = number % 10;
		String yuzlerOku = "";
		String onlarOku = "";
		String birlerOku = "";

		// System.out.println(yuzler + " " + onlar + birler);
		if (number > 99 && number < 1000) {
			switch (yuzler) {
			case 1:
				yuzlerOku = "yuz ";
				break;
			case 2:
				yuzlerOku = "ikiyuz ";
				break;
			case 3:
				yuzlerOku = "ucyuz ";
				break;
			case 4:
				yuzlerOku = "dortyuz ";
				break;
			case 5:
				yuzlerOku = "besyuz ";
				break;
			case 6:
				yuzlerOku = "altiyuz ";
				break;
			case 7:
				yuzlerOku = "yediyuz ";
				break;
			case 8:
				yuzlerOku = "sekizyuz ";
				break;
			case 9:
				yuzlerOku = "dokuzyuz ";
				break;

			}
			switch (onlar) {
			case 0:
				onlarOku = "";
				break;
			case 1:
				onlarOku = "on ";
				break;
			case 2:
				onlarOku = "yirmi ";
				break;
			case 3:
				onlarOku = "otuz ";
				break;
			case 4:
				onlarOku = "kirk ";
				break;
			case 5:
				onlarOku = "elli ";
				break;
			case 6:
				onlarOku = "altmis ";
				break;
			case 7:
				onlarOku = "yetmis ";
				break;
			case 8:
				onlarOku = "seksen ";
				break;
			case 9:
				onlarOku = "doksan ";
				break;
			}
			switch (birler) {
			case 0:
				birlerOku = "";
				break;
			case 1:
				birlerOku = "bir ";
				break;
			case 2:
				birlerOku = "iki ";
				break;
			case 3:
				birlerOku = "uc ";
				break;
			case 4:
				birlerOku = "dort";
				break;
			case 5:
				birlerOku = "bes ";
				break;
			case 6:
				birlerOku = "alti ";
				break;
			case 7:
				birlerOku = "yedi ";
				break;
			case 8:
				birlerOku = "sekiz ";
				break;
			case 9:
				birlerOku = "dokuz ";
				break;
			}

		} else {
			System.out.println("Lutfen 3 basamakli girin");
		}
		System.out.println(yuzlerOku + " " + onlarOku + " " + birlerOku);
		scan.close();

	}

}
