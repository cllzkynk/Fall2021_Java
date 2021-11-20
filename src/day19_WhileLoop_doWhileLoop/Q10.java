package day19_WhileLoop_doWhileLoop;

public class Q10 {

	public static void main(String[] args) {
		// ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		char bas='m';
		
		do {
			System.out.print(bas+", ");
			bas--;
		} while (bas<='m'&&bas>='c');
		
		
	}

}
