
package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q03_AritmaTesisiMaliyet {

	public static void main(String[] args) {
		/*
		 * Bir ar�tma tesisinde ar�t�lan su miktar� g�nde 5000 metrek�pt�r. Ar�t�lan her
		 * 1 metrek�p suyun birim ar�tma bedeli ar�t�lan su hacmine g�re de�i�mektedir.
		 * Tarife a�a��daki gibidir:
		 * 
		 * 2.5 TL (0 � 30.000 metrek�p aras�) 3.0 TL (30.000 � 50.000 metrek�p aras�)
		 * 3,5 TL ( >50.000 metrek�p )
		 * 
		 * Buna g�re, 1 y�l boyunca g�n g�n ar�tma masraflar�n� toplam olarak bulan ve
		 * a�a��daki ekran g�r�nt�s�ne sahip olacak bir program
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
			// System.out.println(i + ". G�n Sonunda Masraf = " + toplam + " TL");
			// gun gun toplam fiyati yazdirir
		}
		System.out.println(xgunluk + ". G�n Sonunda Masraf = " + toplam + " TL"); // bu 365. gun sonunda toplami
		scan.close();																			// yazdirir tek sonuc
	}

}
