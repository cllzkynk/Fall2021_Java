package day17_forLoops;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
		// palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime gir ");
		String str = scan.nextLine();
		String ters = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			ters = ters + str.charAt(i);
		}
		System.out.println("Girilen kelime : " + str);
		System.out.println("Girilen kelimenin tersi : " + ters + "\nve  ");
		if (str.equalsIgnoreCase(ters)) {
			System.out.print(str + " palindrome dir");
		} else {
			System.out.print(str + " palindrome degildir");
		}
		scan.close();
	}

}
