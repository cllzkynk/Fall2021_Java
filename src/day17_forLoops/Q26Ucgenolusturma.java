package day17_forLoops;

import java.util.Scanner;

public class Q26Ucgenolusturma {
	public static void main(String[] args) {
		//Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
		//asagidaki sekli cizdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen boyut icin bir tamsayi gir ");
		int byt = scan.nextInt();
		
		for (int i = 0; i <=byt; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
