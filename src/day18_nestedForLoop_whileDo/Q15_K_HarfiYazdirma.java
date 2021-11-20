package day18_nestedForLoop_whileDo;

public class Q15_K_HarfiYazdirma {

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 8 - i && i != 8) {
					System.out.print(" * ");
				} else if ((i == j + 6 && i > 7)) {
					System.out.print(" * ");
				}
				if (j == 0) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}

