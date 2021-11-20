package day10_TernarySwitchCase;

import java.util.Scanner;

public class C09_SwitchCase {

	public static void main(String[] args) {
		Scanner giris=new Scanner (System.in);
		System.out.println("Lutfen harf notunusu  giriniz");
		char not=giris.next().toUpperCase().charAt(0);
		
		switch(not) {
		case 'A':
			System.out.println("85-100 Arasi");
		break;
		case 'B':
			System.out.println("60-85 Arasi");
		break;
		case 'C':
			System.out.println("50-60 Arasi");
		break;
		case 'D':
			System.out.println("50den dusuk");
		break;
		default:
			System.out.println("Gecersiz harf notu girdiniz");
		
		}
giris.close();
	}

}
