package day19_WhileLoop_doWhileLoop;

public class Q0215e20ye90aBolunenler {

	public static void main(String[] args) {
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam 
		// bolunebilen sayilari yazdirin.
		
		System.out.println("15`e bolunenler");
		for (int i = 100; i < 1000; i++) {
			if (i%15==0) {
				System.out.print(i+", ");
			}
			
		}
		System.out.println("\n20`ye bolunenler");
		for (int i = 100; i < 1000; i++) {
			
			if (i%20==0) {
				System.out.print(i+", ");
			}
			
		}
		System.out.println("\n90`a bolunenler");
		for (int i = 100; i < 1000; i++) {
		
			if (i%90==0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println("\nHem 15`e hem 20`ye hemde 90`a bolunenler");
		for (int i = 100; i < 1000; i++) {
		
			if (i%180==0) {
				System.out.print(i+", ");
			}
		}
		
		
		

	}

}
