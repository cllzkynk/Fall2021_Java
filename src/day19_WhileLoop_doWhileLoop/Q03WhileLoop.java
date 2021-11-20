package day19_WhileLoop_doWhileLoop;

public class Q03WhileLoop {

	public static void main(String[] args) {
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
		// bolunebilen sayilari yazdirin.

		int sayi15 = 100;
		int sayi20 = 100;
		int sayi90 = 100;
		int sayi180 = 100;

		System.out.println("15`e bolunenler");
		while (sayi15 >= 100 && sayi15 <= 999) {
			if (sayi15 % 15 == 0) {
				System.out.print(sayi15 + ", ");

			}
			sayi15++;
		}

		System.out.println("\n20`ye bolunenler");
		while (sayi20 >= 100 && sayi20 <= 999) {
			if (sayi20 % 20 == 0) {
				System.out.print(sayi20 + ", ");

			}
			sayi20++;
		}

		System.out.println("\n90`a bolunenler");
		while (sayi90 >= 100 && sayi90 <= 999) {
			if (sayi90 % 90 == 0) {
				System.out.print(sayi90 + ", ");

			}
			sayi90++;
		}

		System.out.println("\nHem 15`e hem 20`ye hemde 90`a bolunenler");
		while (sayi180 >= 100 && sayi180 <= 999) {
			if (sayi180 % 180 == 0) {
				System.out.print(sayi180 + ", ");

			}
			sayi180++;
		}

	}

}
