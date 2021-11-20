package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class C06_WhileLoop_Odev {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayilar isteyin
		// sayi adedi 10'u gecerse veya toplam 500'u gecerse
		// "Bu kadar sayi yeter"
		// ".. adet sayi girdin, toplami ..." yazdirin

		Scanner scan = new Scanner(System.in);
		// System.out.println("toplamak istedginiz sayilari giriniz");

		double sayi = 0;
		double toplam = 0;
		int adet = 1;

		while (adet <= 10 && toplam <= 500) {
			System.out.println("toplama eklemek istedginiz sayiyi giriniz");
			sayi = scan.nextInt();
			toplam += sayi;
			adet++;

		}
		System.out.println(
				"Bu kadar sayi yeter\n" + (adet - 1) + " sayi girdiniz\nGirilen bu sayilarin toplami : " + toplam);
		scan.close();
	}
}
