package day10_TernarySwitchCase;

import java.util.Random;
import java.util.Scanner;

public class Q01_TasKagitMakas {
	/*
	 * ta� ka��t makas oyunu oyun bilgisayar ile oynanacak biz de�er girelim
	 * klavyeden , bilgisayar random se�im yaps�n ekrana kazand�n�z kaybettiniz
	 * yazs�n.
	 */

	public static void main(String[] args) {

		// 1.ta�
		// 2.ka��t
		// 3.makas

		// bilgisayar�n 1 ile 3 aral���nda random de�er tutmas� laz�m.

		Random random = new Random();
		int makina = random.nextInt(3) +1; // bilgisayar�n 1-3 aral�g�nda de�er tutmas�n� sa�lad�k.

		// System.out.println("makina :"+makina);

		// int makina =2;
		//System.out.println("makina :" + makina);

		System.out.println("1.ta� \n2.ka��t\n3.makas\nL�tfen se�iminizi yap�n�z");
		Scanner okuyucu = new Scanner(System.in);
		int insan = okuyucu.nextInt();
		if (insan != 1 && insan != 2 && insan != 3) {
			System.out.println("yanl�� se�im , kuralina gore oyna.");
		} else {
			// 1.ta�
			// 2.ka��t
			// 3.makas

			// mkn:1 insan:1 berabere
			// mkn:1 insan:2 insan kazand�
			// mkn:1 insan:3 mkn kazand�

			// mkn:2 insan:1 mkn kazand�
			// mkn:2 insan:2 berabere
			// mkn:2 insan:3 insan kazand�

			// mkn:3 insan:1 insan kazand�
			// mkn:3 insan:2 mkn kazand�
			// mkn:3 insan:3 berabere

			// istenilen de�er aral���nda giri� yap�lm��t�r. De�eri bilgisayar ile
			// kar��la�t�rmak gerekecektir.

			if (makina == insan) {
				System.out.println("ucuz yirttin , berabere ");
			} else if (makina == 1 && insan == 2) {
				System.out.println("insan kazand� , makinanin gozu yasli ");
			} else if (makina == 1 && insan == 3) {
				System.out.println("makina kazand� :D ogrende gel");
			} else if (makina == 2 && insan == 1) {
				System.out.println("makina kazand� :D ogrende gel");
			} else if (makina == 2 && insan == 3) {
				System.out.println("insan kazand� , makinanin gozu yasli");
			} else if (makina == 3 && insan == 1) {
				System.out.println("insan kazand� , makinanin gozu yasli");
			} else if (makina == 3 && insan == 2) {
				System.out.println("makina kazand� :D ogrende gel");
			}

		} 
		
		
		
		
		
		

		 okuyucu.close();

	}

}
