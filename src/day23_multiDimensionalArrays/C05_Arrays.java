package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C05_Arrays {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bisiler");
		String str = scan.nextLine();

		String arr[] = str.split(" ");
		System.out.println(arr.length);

		scan.close();

	}

}
