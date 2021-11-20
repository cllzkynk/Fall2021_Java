package day17_forLoops;

import java.util.Scanner;

public class Q16_3gen {
	/*
	 * Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
	 * asagidaki sekli cizdirin
	 *
	 **
	 ***
	 ****
	 *****
	
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("yildizin boyutunu gir ");
		int yildiz = scan.nextInt(); // 3

		for (int i = yildiz; i >=1; i--) { /// yukardan asagiya kac basamak li olacak

			for (int j = yildiz; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println("");
		}
		scan.close();
	} // main sonu
}
