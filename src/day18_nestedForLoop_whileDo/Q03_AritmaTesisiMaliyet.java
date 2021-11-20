
package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q03_AritmaTesisiMaliyet {

	public static void main(String[] args) {
		/*
		 * Bir arýtma tesisinde arýtýlan su miktarý günde 5000 metreküptür. Arýtýlan her
		 * 1 metreküp suyun birim arýtma bedeli arýtýlan su hacmine göre deðiþmektedir.
		 * Tarife aþaðýdaki gibidir:
		 * 
		 * 2.5 TL (0 – 30.000 metreküp arasý) 3.0 TL (30.000 – 50.000 metreküp arasý)
		 * 3,5 TL ( >50.000 metreküp )
		 * 
		 * Buna göre, 1 yýl boyunca gün gün arýtma masraflarýný toplam olarak bulan ve
		 * aþaðýdaki ekran görüntüsüne sahip olacak bir program
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac gunluk rapor istiyon patron ");
		int xgunluk = scan.nextInt();
		int gun = 5000, aritilansu = 5000;
		double fiyat = 0, toplam = 0;

		for (int i = 1; i <= xgunluk; i++) {

			if (aritilansu <= 30000) {
				fiyat = gun * 2.5;
			} else if (aritilansu > 30000 && aritilansu <= 50000) {
				fiyat = gun * 3;
			} else if (aritilansu > 50000) {
				fiyat = gun * 3.5;
			}
			aritilansu = aritilansu + 5000;
			toplam = toplam + fiyat;
			// System.out.println(i + ". Gün Sonunda Masraf = " + toplam + " TL");
			// gun gun toplam fiyati yazdirir
		}
		System.out.println(xgunluk + ". Gün Sonunda Masraf = " + toplam + " TL"); // bu 365. gun sonunda toplami
		scan.close();																			// yazdirir tek sonuc
	}

}
