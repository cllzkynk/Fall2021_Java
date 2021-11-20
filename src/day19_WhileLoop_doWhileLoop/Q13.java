package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar
		 * devam istemeyi ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve
		 * kac sayi girildigini yazdirin
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int sayi = 0;
		int top = 0;
		int sayac = 0;
		String cikis = "1";

		System.out.println("Lutfen toplanmak uzere sayilar giriniz.Cikis icin sifir girisi yapabilirsiniz");

		do {
			sayi = scan.nextInt();
			cikis = Integer.toString(sayi);

			if (sayi <= 500) {

				top = top + sayi;
				sayac++;

			} else {
				System.out.println("Biz 10 sayiya ve 500 e kadar hizmet veriyoruz emmi\nSimdi tekrar basla bakiim");
			}
		} while (sayac < 10 && top <= 500 && !cikis.equals("0"));

		if (!cikis.equals("0")) {
			System.out.println("Bu kadar yeter");
			System.out.println("Toplam " + sayac + " sayi girdin ve bu sayilarin toplami " + top);
		} else {

			System.out.println("Toplam " + (sayac - 1) + " sayi girdin ve bu sayilarin toplami " + top);
		}

		scan.close();
	}

}
