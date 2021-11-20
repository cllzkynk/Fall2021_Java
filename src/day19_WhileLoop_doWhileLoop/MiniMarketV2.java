package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class MiniMarketV2 {
	/**
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun Musteri karti varsa ve 10 urunden fazla
	 * alirsa %20, yoksa %15 indirim yapin Musteri karti yoksa ve 10 urunden fazla
	 * alirsa %15, 10 urunden az alirsa %10 indirim yapin Musteri kart bilgisini
	 * yanlis girerse alisverise baslatmadan tekrar sorunuz. alisveris sonunda
	 * alisverise devam etmeyecegini sorup devam edecekse tekrar alis veris yaptirip
	 * ilk alisverisinden alinan urunleri de dikkate alarak 10 ve uzeri ise son
	 * toplami 10dan az veya fazla olma sartina gore indirim uygulayiniz
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in); // scanner in ismi scan olmak zorunda degil

		System.out.println("𝕋𝔼ℂℍℙℝ𝕆𝔼𝔻`𝔼 ℍ𝕆𝕊𝔾𝔼𝕃𝔻𝕀ℕ𝕀ℤ");
		
		boolean karar = true;
		int toplamUrun = 0;
		double toplamFiyat = 0;
		char card = 'x';
		double hamFiyat = 0;

		do {
			System.out.println("Lutfen musteri kartiniz varsa E yoksa H giriniz");
			char cardKontrol = giris.next().toUpperCase().charAt(0);

			if (cardKontrol == 'E' || cardKontrol == 'H') {
				card = cardKontrol;
				break;
			} else {
				System.out.println("Lutfen card sahipligi bilginizi evet icin  E ve hayir icin H seklinde giriniz");
			}

		} while (card != 'E' || card != 'H');

		// System.out.println(card);

		if (card == 'E') {
			do {
				int quantity = 0;
				double araToplam = 0;
				System.out.println("Lutfen aldiginiz urunun adedini giriniz");
				quantity = giris.nextInt();
				toplamUrun = toplamUrun + quantity;
				
				System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
				double price = giris.nextInt();
				araToplam = quantity * price;
				
				hamFiyat=hamFiyat+price*quantity;
				
				
				if (toplamUrun >= 10) {
					
					araToplam = quantity * price* 0.8;
					
					System.out.println("Urun sayisi " + toplamUrun
							+ ".Urun sayisi 10 adet ve  uzeri oldugu icin %20 indirim kazandiniz \nAra toplam :"
							+ araToplam);
					hamFiyat=hamFiyat*0.8;
				} else if (toplamUrun < 10) {
				
					araToplam= quantity * price* 0.85;
					

					System.out.println("Urun sayisi " + toplamUrun
							+ ".Urun sayisi 10 adetten az  oldugu icin %15 indirim kazandiniz \nAra toplam :"
							+ araToplam);
					hamFiyat=hamFiyat*0.85;
				}

				char carar = 'x';
				do {
					System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E Hayir icin H giriniz");
					carar = giris.next().toUpperCase().charAt(0);
					if (carar == 'H') {
						karar = false;
						System.out.println("Toplam tutar : " +hamFiyat);
						System.out.println(
								"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
						break;
					} else if (carar == 'E') {
						break;
					} else if (carar != 'E' || carar != 'H') {
						System.out.println("Lutfen devam etmek icin E sonlandirmak icin H girisi yapiniz");
					}
				} while (carar != 'E' || carar != 'H');
			} while (karar);
		} else if (card == 'H') {

			do {
				int quantity = 0;
				double araToplam = 0;
				System.out.println("Lutfen aldiginiz urunun adedini giriniz");
				quantity = giris.nextInt();
				toplamUrun = toplamUrun + quantity;
				
				System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
				double price = giris.nextInt();
				araToplam = quantity * price;

				if (toplamUrun >= 10) {
			
					araToplam = quantity * price* 0.85;
					

					System.out.println("Urun sayisi " + toplamUrun
							+ ".Urun sayisi 10 adet ve  uzeri oldugu icin %15 indirim kazandiniz \nAra toplam :"
							+ araToplam);
					hamFiyat=hamFiyat*0.85;

				} else if (toplamUrun < 10) {
			
					araToplam = quantity * price* 0.9;

					

					System.out.println("Urun sayisi " + toplamUrun
							+ ".Urun sayisi 10 adetten az oldugu icin %10 indirim kazandiniz \nAra toplam :"
							+ araToplam);
					hamFiyat=hamFiyat*0.9;
				}
				char carar = 'x';
				do {
					System.out.println("\nAlisverise devam etmek istiyormusunuz\nEvet icin E Hayir icin H giriniz");
					carar = giris.next().toUpperCase().charAt(0);
					if (carar == 'H') {
						karar = false;
						System.out.println("Toplam tutar : " + hamFiyat);
						System.out.println(
								"𝓣𝓔𝓒𝓗𝓟𝓡𝓞𝓔𝓓`𝓘 𝓣𝓔𝓡𝓒𝓘𝓗 𝓔𝓣𝓣𝓘𝓖𝓘𝓝𝓘𝓩 𝓘𝓒𝓘𝓝 𝓣𝓔𝓢𝓔𝓚𝓚𝓤𝓡 𝓔𝓓𝓔𝓡𝓘𝓩");
						break;
					} else if (carar == 'E') {
						break;
					} else if (carar != 'E' || carar != 'H') {
						System.out.println("Lutfen devam etmek icin E sonlandirmak icin H girisi yapiniz");
					}
				} while (carar != 'E' || carar != 'H');

			} while (karar);
		}

		System.out.println();
		giris.close();
	}

}
