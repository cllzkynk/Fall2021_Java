package day10_TernarySwitchCase;

import java.util.Scanner;

public class C10_SwitchCase {

	public static void main(String[] args) {
		/* Soru3 : Kullanicidan bir sayi girmesini isteyin
		 Girilen sayi
		 10 ise “Iki basamakli en kucuk sayi 
		 100 ise “uc basamakli en kucuk sayi”
		 1000 ise “dort basamakli en kucuk sayi”
		 diger durumlarda “Girdigin sayiyi degistir” yazdirin  */
		
		Scanner giris=new Scanner (System.in);
		System.out.println("Lutfen 10-100-1000`den birini  giriniz");
		int sayi=giris.nextInt();
		
		switch(sayi) {
		case 10:
		System.out.println("Iki basamakli en kucuk sayi");
		break;
		
		case 100:
			System.out.println("Uc basamakli en kucuk sayi");
			break;
		
		case 1000:
			System.out.println("Dort basamakli en kucuk sayi");
			break;
			default:
				System.out.println("Olmadi be haci dedigim sayilari girmedin ve kaybettin");
		}
		
giris.close();
	}

}
