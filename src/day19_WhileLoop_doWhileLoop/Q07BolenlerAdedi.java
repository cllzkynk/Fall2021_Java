package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q07BolenlerAdedi {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
		 * olduklarini ekranda yazdirin
		 */
		Scanner giris = new Scanner(System.in);
		System.out.println(" tam sayi  gir");
		int num = giris.nextInt();
		
		int bolenAday=1;
		
		while (bolenAday<=num) {
			if (num% bolenAday==0) {
				System.out.print( bolenAday+" , ");
				
			}
			 bolenAday++ ; }
		
giris.close();
	}

}
