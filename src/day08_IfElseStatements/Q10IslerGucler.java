package day08_IfElseStatements;

import java.util.Scanner;

public class Q10IslerGucler {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Kullanýcýdan 2 sayý alýn ve 4 iþlem yaptýrýn
		// Ipucu System.out.println("1: Toplama \n2: Çýkarma\n3: Çarpma\n4: Bölme");
		// System.out.println("Lütfen Yapmak Ýstediðiniz Ýþlemi 1 , 2, 3, 4 Olarak
		// Seçiniz!");burda 1secerse
		// toplma yaptiricak mesela
		Scanner input = new Scanner(System.in);  
		System.out.println("Lutfen iki sayi giriniz" + "\nilk sayiyi girince entera basiniz");

		if (input.hasNextInt()) {
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();

			System.out
					.println("lutfen yapmak istediginiz islemi seciniz\n1: Toplama \n2: Çýkarma\n3: Çarpma\n4: Bölme");
			int islem = input.nextInt();

			if (islem == 1) {
				System.out.println("birinci islemi sectiniz toplamlari :" + (sayi1 + sayi2));
			}

			else if (islem == 2) {
				System.out.println("ikinci islemi sectiniz farklari : " + (sayi1 - sayi2));

			} else if (islem == 3) {
				System.out.println("ucuncu islemi sectiniz carpimlari : " + (sayi1 * sayi2));

			} else if (islem == 4) {
				System.out.println("dorduncu islemi sectiniz bolumleri : " + (sayi1 / sayi2));

			}
		} else {
			System.out.println("lutfen islem icin gecerli sayi giriniz ");

		}

	}

}
