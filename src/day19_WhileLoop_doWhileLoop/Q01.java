package day19_WhileLoop_doWhileLoop;



public class Q01 {

	public static void main(String[] args) {
		// While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
	
		int sayi = 3;
		while (sayi >= 3 && sayi <= 13) {
			if (sayi % 2 == 1) {
				System.out.println(sayi);

			}
			sayi++;
		}

	}

}
