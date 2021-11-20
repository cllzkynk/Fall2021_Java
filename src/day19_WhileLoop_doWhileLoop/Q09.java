package day19_WhileLoop_doWhileLoop;

public class Q09 {

	public static void main(String[] args) {
		//9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
		
		int bas=9;
		do {
			if (bas%7==0) {
				System.out.print(bas+", ");
			}
			bas++;
		} while (bas>=9 && bas<=190);

	}

}
