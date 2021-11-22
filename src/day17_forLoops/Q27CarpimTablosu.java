package day17_forLoops;

import java.util.Scanner;

public class Q27CarpimTablosu {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim 
		//tablosu olusturun. Ornek,kullanici 3 girerse,
		//  1 2 3
		//  2 4 6
		//  3 6 9
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen boyut icin bir tamsayi gir ");
		int byt = scan.nextInt();
		
		for (int i = 1; i <=byt; i++) {
			for (int j = 1; j <=byt; j++) {
				System.out.print(i*j);
			}
			System.out.println();
		}
		
		
		scan.close();
		

	}

}
