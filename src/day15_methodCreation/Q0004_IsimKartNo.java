package day15_methodCreation;

import java.util.Scanner;

public class Q0004_IsimKartNo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi  yaziniz");
		String isim = scan.nextLine();
		System.out.println("Soyisminizi  yaziniz");
		String soyisim = scan.nextLine();
		System.out.println("Kart nonu bosluk birakmadan yaziniz ");
		String kartno = scan.next();

		
		
		//System.out.println(isimler(isim, soyisim));
		
		
		int BoslukIn=isim.indexOf(" "); //4
//ayse gul pinar ece
//1234567887456321
	
		int bosluk2=isim.substring(isim.indexOf(" ")+1).indexOf(" ");
		
		System.out.println("KARMA INDEX " +bosluk2);
		
		String IIsim=isim.substring(0, 1).toUpperCase() + isim.substring(1,isim.indexOf(" ")+1).toLowerCase()
				
				
				+isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2).toUpperCase()
				
				
				+isim.substring(isim.indexOf(" ")+2).toLowerCase();
		
		
		
		String SoyIIsim= soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		
		System.out.println(IIsim +" "+SoyIIsim);
		
		System.out.println(kart(kartno));
	
	scan.close();

	}// main sonu

	
	
	public static String kart(String kartno) {

	String	kartono=kartno.substring(0, 4) + " " + kartno.substring(4, 8) + " " + kartno.substring(8, 12) + " "
				+ kartno.substring(12);

		 return kartono;
	}
/*
	public static String isimler(String isim, String soyisim) {
		
		String IIsim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() ;
				String SoyIIsim= soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

		 return IIsim+" "+SoyIIsim;
	}
*/
}
