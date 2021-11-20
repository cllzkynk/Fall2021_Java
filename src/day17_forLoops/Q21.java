package day17_forLoops;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		/*
		 * Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den
		 * baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak; - Sayi 3’un
		 * kati ise sayi yerine “Java” yazdirin. - Sayi 5’in kati ise sayi yerine
		 * “Guzeldir” yazdirin. - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java
		 * Guzeldir” yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi gir ");
		int sayi = scan.nextInt();
		
		for (int i = 1; i<=sayi; i++) {
			if (i%15==0) {
				System.out.println(" Java Guzeldir ");
			}else if(i%5==0){
				System.out.println(" Guzeldir ");
			}else if(i%3==0){
				System.out.println(" Java ");
			}else {
				System.out.println(i+" ");
			}
			
		}
		
		scan.close();

	}

}
