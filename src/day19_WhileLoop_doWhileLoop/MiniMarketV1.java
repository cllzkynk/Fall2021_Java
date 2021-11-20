package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

/*
 * @author CELİL
 */
public class MiniMarketV1 {
	public static void main(String[] args) {
		/*
		 * SORU 1 Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun Musteri karti varsa ve 10 urunden fazla
		 * alirsa %20, yoksa %15 indirim yapin Musteri karti yoksa ve 10 urunden fazla
		 * alirsa %15, 10 urunden az alirsa %10 indirim yapin
		 */
		Scanner giris = new Scanner(System.in); // scanner in ismi scan olmak zorunda degil

		System.out.println("𝕋𝔼ℂℍℙℝ𝕆𝔼𝔻`𝔼 ℍ𝕆𝕊𝔾𝔼𝕃𝔻𝕀ℕ𝕀ℤ");
		System.out.println("Lutfen musteri kartiniz varsa E yoksa H giriniz");
		char card = giris.next().toLowerCase().charAt(0);
		boolean karar = true;
		int quantity = 0;
		if (card == 'e') {
			do {

				double totalPrice = 0;
				System.out.println("Lutfen aldiginiz urunun adedini giriniz");
				quantity = quantity + giris.nextInt();

				System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
				double price = giris.nextInt();
				totalPrice = quantity * price;

				if (quantity >= 10) {
					price = price * 0.8;
					totalPrice = quantity * price;

					System.out.println("Toplam " + quantity
							+ " urun aldiginiz.10 adet ve  uzeri oldugu  icin %20 indirim kazandiniz \nOdeyeceginiz  tutar :"
							+ totalPrice);

				} else {
					price = price * 0.85;
					totalPrice = quantity * price;

					System.out.println("Toplam " + quantity
							+ " urun aldiginiz. 10 adetten az oldugu icin %15 indirim kazandiniz \nOdeyeceginiz  tutar :"
							+ totalPrice);
				}

				System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E Hayir icin H giriniz");
				char carar = giris.next().toUpperCase().charAt(0);
				if (carar != 'E') {
					karar = false;
					System.out.println(
							"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
				}

			} while (karar);
		} else if (card == 'h') {

			do {
				double totalPrice = 0;
				System.out.println("Lutfen aldiginiz urunun adedini giriniz");
				quantity = quantity + giris.nextInt();

				System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
				double price = giris.nextInt();
				totalPrice = totalPrice + quantity * price;

				if (quantity >= 10) {
					price = price * 0.85;
					totalPrice = quantity * price;

					System.out.println("Toplam " + quantity
							+ " urun aldiginiz ve toplam 10 adet ve  uzeri oldugu icin %15 indirim kazandiniz \nOdeyeceginiz  tutar :"
							+ totalPrice);

				} else {
					price = price * 0.9;
					totalPrice = quantity * price;

					System.out.println("Toplam " + quantity
							+ " urun aldiginiz ve toplam 10 adetten az oldugu icin %10 indirim kazandiniz \nOdeyeceginiz  tutar :"
							+ totalPrice);
				}
				System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E Hayir icin H giriniz");
				char carar = giris.next().toUpperCase().charAt(0);
				if (carar != 'E') {
					karar = false;
					System.out.println(
							"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
				}

			} while (karar);
		}

		System.out.println();
		giris.close();
	}

}
