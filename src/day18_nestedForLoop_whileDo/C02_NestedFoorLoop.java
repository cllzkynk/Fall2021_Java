package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class C02_NestedFoorLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10'dan kucuk pozitif bir tam sayi girin...");
		int sayi = scan.nextInt();
		for (int satir = 1; satir <= sayi; satir++) {
			for (int i = 1; i <= satir; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		scan.close();

	}

}
