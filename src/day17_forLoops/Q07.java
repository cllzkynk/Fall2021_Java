package day17_forLoops;

import java.util.Scanner;

public class Q07 {
//pow() metodu kullanmadan girilen sayýnýn üssünü alan programýni yaziniz

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hadi gir bi taban");
		int taban = scan.nextInt();
		System.out.println("Bide us giriver");
		int kuvvet = scan.nextInt();

		long sonuc = 1L;

		for (int i = kuvvet; i > 0; i--) {
			sonuc *= taban;
		}

		System.out.println("Girilen sayilara gore sonuc = " + sonuc);

		scan.close();
	}

}
