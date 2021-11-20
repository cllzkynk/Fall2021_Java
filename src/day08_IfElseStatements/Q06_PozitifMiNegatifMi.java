package day08_IfElseStatements;

import java.util.Scanner;

public class Q06_PozitifMiNegatifMi {

	public static void main(String[] args) {
		
		// Kullanicidan bir tamsayi isteyin
		// sayi pozitif ise "sayi pozitif" yazdirin
		// sayi 100'den kucukse "kucuk sayi" yazdirin
		// sayi 1000'den buyukse "buyuk sayi" yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int tamSayi = scan.nextInt();
		
		if (tamSayi>0) {
			System.out.println("sayi pozitif");
		}
		
		if (tamSayi<100) {
			System.out.println("kucuk sayi");
		}
		
		if (tamSayi>1000) {
			System.out.println("buyuk sayi");
		}

		scan.close();
	}

}