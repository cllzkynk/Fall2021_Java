package day17_forLoops;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen 
		//sayinin faktoryel’ini bulun. (5!=5*4*3*2*1
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi gir ");
		int sayi1 = scan.nextInt();
		
		int fak=1;
		
		for (int i = sayi1 ; i >1; i--) {
			fak *=i;
			System.out.print(i+"*");
			
		}
		System.out.print("1="+fak);
		
		
		
		
		
		
		
scan.close();
	}

}
