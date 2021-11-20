package day17_forLoops;

import java.util.Scanner;

public class Q05_BaklavaDeseni {

	public static void main(String[] args) {
		// yildiz li baklava.

		Scanner scan = new Scanner(System.in);
		System.out.println("yildiz basamak sayisini gir");
		int boyut = scan.nextInt();
		int boyutYari = (int) (boyut / 2)+1 ;
		

		for (int i = 0; i < boyutYari; i++) {  // ust kismi 

			 for (int k =0; k<=boyutYari-i ;k++)
			 System.out.print(" ");

			for (int j = 0; j <= 2*i; j++)
				System.out.print("*");

			System.out.println("");
		}
		
		for (int i = boyutYari-2; i >=0; i--) {  //  alt

			 for (int k =0; k<=boyutYari-i ;k++)
			 System.out.print(" ");

			for (int j = 0; j <= 2*i; j++)
				System.out.print("*");

			System.out.println("");
		}
		scan.close();
	}

}
