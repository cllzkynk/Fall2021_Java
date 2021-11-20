package day17_forLoops;

import java.util.Scanner;

public class Q09 {
//1 -n arasýndaki asal sayýlarý yazdýriniz 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Nereye kadar gidik");
		int ucBeyi = scan.nextInt();

		for (int i = 2; i <= ucBeyi; i++) { // 15=16
			int kontrol = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					kontrol = 1;
					break;
				} else {
					kontrol = 0;
				}

			}
			if (kontrol == 0) {
				System.out.print(i + " ,");

			}

		}

		scan.close();

	}
}
