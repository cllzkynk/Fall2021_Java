package day10_TernarySwitchCase;

import java.util.Random;
import java.util.Scanner;

public class Q01_TasKagitMakas {
	/*
	 * taş kağıt makas oyunu oyun bilgisayar ile oynanacak biz değer girelim
	 * klavyeden , bilgisayar random seçim yapsın ekrana kazandınız kaybettiniz
	 * yazsın.
	 */

	public static void main(String[] args) {

		// 1.taş
		// 2.kağıt
		// 3.makas

		// bilgisayarın 1 ile 3 aralığında random değer tutması lazım.

		Random random = new Random();
		int makina = random.nextInt(3) +1; // bilgisayarın 1-3 aralıgında değer tutmasını sağladık.

		// System.out.println("makina :"+makina);

		// int makina =2;
		//System.out.println("makina :" + makina);

		System.out.println("1.taş \n2.kağıt\n3.makas\nLütfen seçiminizi yapınız");
		Scanner okuyucu = new Scanner(System.in);
		int insan = okuyucu.nextInt();
		if (insan != 1 && insan != 2 && insan != 3) {
			System.out.println("yanlış seçim , kuralina gore oyna.");
		} else {
			// 1.taş
			// 2.kağıt
			// 3.makas

			// mkn:1 insan:1 berabere
			// mkn:1 insan:2 insan kazandı
			// mkn:1 insan:3 mkn kazandı

			// mkn:2 insan:1 mkn kazandı
			// mkn:2 insan:2 berabere
			// mkn:2 insan:3 insan kazandı

			// mkn:3 insan:1 insan kazandı
			// mkn:3 insan:2 mkn kazandı
			// mkn:3 insan:3 berabere

			// istenilen değer aralığında giriş yapılmıştır. Değeri bilgisayar ile
			// karşılaştırmak gerekecektir.

			if (makina == insan) {
				System.out.println("ucuz yirttin , berabere ");
			} else if (makina == 1 && insan == 2) {
				System.out.println("insan kazandı , makinanin gozu yasli ");
			} else if (makina == 1 && insan == 3) {
				System.out.println("makina kazandı :D ogrende gel");
			} else if (makina == 2 && insan == 1) {
				System.out.println("makina kazandı :D ogrende gel");
			} else if (makina == 2 && insan == 3) {
				System.out.println("insan kazandı , makinanin gozu yasli");
			} else if (makina == 3 && insan == 1) {
				System.out.println("insan kazandı , makinanin gozu yasli");
			} else if (makina == 3 && insan == 2) {
				System.out.println("makina kazandı :D ogrende gel");
			}

		} 
		
		
		
		
		
		

		 okuyucu.close();

	}

}
