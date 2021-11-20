package day17_forLoops;

import java.util.Scanner;

public class C03_ForLoopForsuz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in, "ISO-8859-9");
		System.out.print("bir kelime girin: ");
		String yazi = scan.nextLine();
		String cevrilen = cevir(yazi);
		System.out.println("Çevrilen Yazý: " + cevrilen);

		scan.close();
	}

	public static String cevir(String yazi) {
		if (yazi.isEmpty())
			return yazi;

		return cevir(yazi.substring(1)) + yazi.charAt(0);
	}
}
// hocam metodlara calisirken denk geldim recursive metod (ozyinelemeli) 
//  kendi kendini cagiran metod  deniyormus