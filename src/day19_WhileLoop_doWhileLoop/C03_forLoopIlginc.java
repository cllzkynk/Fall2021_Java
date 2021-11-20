package day19_WhileLoop_doWhileLoop;



public class C03_forLoopIlginc {
	public static void main(String[] args) {

		int sayi = 11;
		int toplam = 0;

		for (int i = sayi; i >= 1; i /= 10) {

			toplam += (i % 10);

		}

		System.out.println(toplam);

	}
}
