package day17_forLoops;

import java.util.Scanner;

public class Q10 {
//1�den ba�layarak verilen say�ya kadar olan t�m say�lar�n toplaminin sonucunu bulunuz

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nereye kadar gidik");
		int ucBey = scan.nextInt();
		int toplam = 0;
		for (int i = 1; i <= ucBey; i++) {
			toplam += i;

		}

		System.out.println("Girdiginiz sayiya kadar olan sayilarin toplami : " + toplam);

		scan.close();
	}
}
