package day18_nestedForLoop_whileDo;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Bir S=abcd asal say�s� var. Bu say� a1000+b100+c10+d �ye e�ittir. Ayr�ca
		 * a+b+c+d=20 ve ab=72�dir. Buna g�re S say�s�n�n alaca�� de�erleri ve ald���
		 * de�erlerin asal olup olmad���n� yazd�ran Java program�n� yaziniz
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
						System.out.println(s + " Say�s� Asal Say�d�r ve Probleme Uymaktad�r.");
						break;

					}

				}
				if (sayac == 1) {
					System.out.println(s + " Say�s� Asal Say� De�ildir, Dolay�s�yla Probleme Uymamaktad�r.");
				}
			}

		}

	}

}
