package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q06carpimtablosu {

	public static void main(String[] args) {
		/* Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana 
		yazdirin. Kullanicinin hata yapmadigini farz edin.
		Ornegin kullanici 3 girerse;
		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30  */
		Scanner giris = new Scanner(System.in);
		System.out.println(" tam sayi  gir");
		int num = giris.nextInt();
		
		int carpmaBas=0;
		while (carpmaBas<=10) {
			System.out.println(num+ " * "+carpmaBas+" = "+(num*carpmaBas));
			carpmaBas++;
		}
		
giris.close();
	}

}
