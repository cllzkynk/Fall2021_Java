package day18_nestedForLoop_whileDo;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class Ad_LoopMethodCover01 {
	public static void main(String[] args) {
		// n e kadar olan tamsayilarin toplamini loopsuz bulalim
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaca kadar toplam istiyon sen");
		int limit = scan.nextInt();
		// toplam(limit);
		System.out.println(toplam(limit));
		
		scan.close();

	}

	public static int toplam(int limit) {
		if (limit == 1) {
			return limit = 1;
		}

		return limit + toplam(limit - 1);

	}
}