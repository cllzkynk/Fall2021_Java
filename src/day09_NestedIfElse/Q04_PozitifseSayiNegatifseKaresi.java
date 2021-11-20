package day09_NestedIfElse;

import java.util.Scanner;

public class Q04_PozitifseSayiNegatifseKaresi {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
		// sayinin karesini yazdiri

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi = input.nextDouble();

		System.out.println(sayi > 0 ? "Sayi pozitif"
				: (sayi < 0 ? "negatif sayi girdin ve sayinin karesi : " + (Math.pow(sayi, 2))
						: "sayi 0 a esit ve negatiflik poztiflik olmaz"));

		 if (sayi > 0) {
			System.out.println(" if`li cevap :   Sayi pozitif");
		} else {
			if (sayi < 0) {
				System.out.println(" if`li cevap :  negatif sayi girdin ve sayinin karesi : " + (Math.pow(sayi, 2)));
			} else {
				System.out.println("if`li cevap :   sayi 0 a esit ve negatiflik poztiflik olmaz");
			}

		} 

		input.close();

		// Math.pow(2, 5) ===>> 2 uzeri 5 demek
		// Math.sqrt(9) ===>> 9 un karekokunu alir
	}

}
