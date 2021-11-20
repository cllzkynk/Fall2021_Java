package day07_IfStatementsOdevler;

import java.util.Scanner;

public class Q1_TamSayiTekCiftMi {

	public static void main(String[] args) {
		//Kullanicidan bir tamsayi isteyin ve sayinin tek mi cift mi oldugunu yazdiriniz
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Tek mi Cift mi kontrolu icin lutfen bir tamsayi giriniz");
		int tam=scan.nextInt();
		
		if (tam%2==0) {
			System.out.println("Girdiginiz sayi cift tamsayidir");
		}
		
		if (tam%2==1) {
			System.out.println("Girdiginiz sayi tek tamsayidir");
		}

		
		scan.close();
	}

}
