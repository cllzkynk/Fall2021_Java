/**
 * 
 */
package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class C02_WhileLoop {

	/**
	 * Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
	 * yazdirin
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner celil = new Scanner(System.in);

		System.out.print("Bir Sayý Girin: ");

		int num = celil.nextInt();

		int adet = 0, toplam = 0;

		while (num != 0) {
			toplam = (num % 10) + toplam;
			num /= 10;
			++adet;
		}

		System.out.println("Basamak Toplamý: " + toplam);
		celil.close();
	}
}