package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q11ToplamaOyunu0laCikis {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini 
		//soyleyin.
		Scanner scan=new Scanner (System.in);
		int top=0;
		int sayi=1;
		int sayac=-1;
		System.out.println("toplamak icin sayilarin giriniz girisinizi bitirmek icin 0 girisi yapiniz");
		do {
			//System.out.println("toplamak icin sayilarin giriniz girisinizi bitirmek icin 0 girisi yapiniz");
			sayi=scan.nextInt();
			top=top+sayi;
			sayac++;
		} while (sayi!=0);
		
		System.out.println("Toplam "+sayac+ "  sayi girdiniz");
		System.out.println("Girilen sayilarin toplami : "+top);
		
scan.close();
	}

}
