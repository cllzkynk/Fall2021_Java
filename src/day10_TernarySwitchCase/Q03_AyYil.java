package day10_TernarySwitchCase;

import java.util.Scanner;

public class Q03_AyYil {
	/*
	 * (Bir ayýn gün sayýsý) Kullanýcýdan ay ve yýl bilgisini alan ve yýlýn bu ayýna
	 * ait gün sayýsýný gösteren bir program yazýnýz. Örneðin; kullanýcý ay için 2
	 * ve yýl için 2012 girerse, program “Þubat 2012, 29 gündür”(artik yil kontrolu) mesajýný
	 * gösterecek. Eðer kullanýcý ay için 3 ve yýl için 2015 girerse, program “Mart
	 * 2015, 31 gündür” mesajýný gösterecek.
	 */
	public static void main(String[] args) {
		
		// System.out.println(""+ay+ " "+yil +" ,"+kacGunCeker+" "+"gundur");	
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen ay numarasini giriniz");
		int ayno=scan.nextInt();
		System.out.println("Lutfen yili giriniz");
		int yil=scan.nextInt();
		int kacGunCeker =0;
		String ay = "";
		
			switch (ayno) {
			case 1:
				ay="ocak";
				break;
			case 2:
				ay="subat";
				break;
			case 3:
				ay="mart";
				break;
			case 4:
				ay="nisan";
				break;
			case 5:
				ay="mayis";
				break;
			case 6:
				ay="haziran";
				break;
			case 7:
				ay="temmuz";
				break;
			case 8:
				ay="agustos";
				break;
			case 9:
				ay="eylul";
				break;
			case 10:
				ay="ekim";
				break;
			case 11:
				ay="kasim";
				break;
			case 12:
				ay="aralik";
				break;
				

			default:
				break;
			}
			
			if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {
				kacGunCeker=29 ;
			} else {
				kacGunCeker=28 ;
			}
			
			switch (ayno) {
			case 2:

				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				kacGunCeker= 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				kacGunCeker= 30;
				break;
		default:
			System.out.println("Gecerli bir ay giriniz");
			}
			
			
			
		System.out.println(""+ay+ " "+yil +" ,"+kacGunCeker+" "+" gundur");	
			
			
	scan.close()		;
			

	}

}
