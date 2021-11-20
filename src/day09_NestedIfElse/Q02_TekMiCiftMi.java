package day09_NestedIfElse;

import java.util.Scanner;

public class Q02_TekMiCiftMi {

	public static void main(String[] args) {
		// Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		Scanner input=new Scanner (System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int a=input.nextInt();
		System.out.println(a%2==0?(a<0 ? "Negatiflerde teklik ciftlik olmaz haci" : "Sayi cift sayidir"):
			(a<0 ? "Negatiflerde teklik ciftlik olmaz haci" : "Sayi tek sayidir"));
		
		input.close();
	}
}
