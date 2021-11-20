package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
	public static void main(String[] args) {
// Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane 
//olduklarini ekranda yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi =scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen+ "  ");
				sayac++;
			}//if sonu
			bolen++;
			
		}//while sonu
System.out.println("\n"+sayi+"  sayisinin toplam toplam "+sayac +" tane boleni vardir");
	scan.close();}//main sonu
}//clas sonu 
