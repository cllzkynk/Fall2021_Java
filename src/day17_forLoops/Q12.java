package day17_forLoops;


import java.util.Scanner;

public class Q12 {
// girilen iki sayinin ebobunu bulunuz
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi1: ");
		int bir=scan.nextInt();
		System.out.println("sayi2: ");
		int iki=scan.nextInt();
		
		int ebob=1;
		
		for (int i = 1; i<=bir && i<=iki ; ++i) {
			
			if (bir%i==0 &&iki%i==0) {
				 ebob=i;
			}
			 // System.out.println(i+" . "+ebob);
		}
		
		 System.out.println(ebob);
		scan.close();
	}
}
