package day17_forLoops;


import java.util.Scanner;

public class Q14_Yildizimsi {
/*
 * Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
asagidaki sekli cizdirin

*
* *
* * *
* * * *
 
 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("yildizin boyutunu gir ");
		int yildiz=scan.nextInt(); // 3
		
		for (int i = 1; i <=yildiz; i++) {
			
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		scan.close();
	}
}
