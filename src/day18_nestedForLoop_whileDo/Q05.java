package day18_nestedForLoop_whileDo;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Bir S=abcd asal sayýsý var. Bu sayý a1000+b100+c10+d ‘ye eþittir. Ayrýca
		 * a+b+c+d=20 ve ab=72’dir. Buna göre S sayýsýnýn alacaðý deðerleri ve aldýðý
		 * deðerlerin asal olup olmadýðýný yazdýran Java programýný yaziniz
		 */
		for (int s = 1000; s < 10000; s++) {
			int toplam, carpim, sayac = 1;
			int a, b, c, d;
			a = s / 1000;
			b = s / 100 - 10 * a;
			c = s / 10 - 100 * a - 10 * b;
			d = s - (1000 * a + 100 * b + 10 * c);

			toplam = a + b + c + d;
			carpim = a * d;

			if (toplam == 20 && carpim == 72) {

				for (int i = 2; i < s; i++) {
					sayac = 1;
					if (s % i == 0) {
						sayac = 0;
						System.out.println(s + " Sayýsý Asal Sayýdýr ve Probleme Uymaktadýr.");
						break;

					}

				}
				if (sayac == 1) {
					System.out.println(s + " Sayýsý Asal Sayý Deðildir, Dolayýsýyla Probleme Uymamaktadýr.");
				}
			}

		}

	}

}
