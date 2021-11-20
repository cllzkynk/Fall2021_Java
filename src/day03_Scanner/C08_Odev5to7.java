package day03_Scanner;

import java.util.Scanner;

public class C08_Odev5to7 {

	public static void main(String[] args) {
		/* Soru 5 
		 * Kullanicidan ismini ve soyismini alip 
		 * Ismini:
		 * Soyisminiz:
		 * Kursumuza katiliminiz alinmistir Tesekkur ederiz
		 * seklinde yazdiriniz
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soy isminizi giriniz");
		String soyIsim=scan.nextLine();
		System.out.println("Isminiz :  " + isim + "\nSoyisminiz :  "+
		soyIsim+ "\nKursumuza katiliminiz alinmistir, Tesekkur ederiz");
		
		System.out.println("-------------------------------------------------------------------------");
		
		/*Soru 6 
		 * kullanicidan ismini ve soyismini alip aralarinda bosluk olacak sekilde yazdiriniz.
		 * isminiz-soyisminiz : Celil OZkaynak 
		 */
		 System.out.println("Lutfen isminizi   giriniz");
		 String isimB=scan.nextLine();
		 System.out.println("Lutfen soyisminizi giriniz");
		 String soyIsimB=scan.nextLine();
		 System.out.println("Isminiz-Soyisminiz  : " +isimB + " "+ soyIsimB);
		
		 System.out.println("-------------------------------------------------------------------------");
		 
		 /*Soru 7
		  *  kullaicidan ismini alip ilk harfini yazdiriz
		  */
		 System.out.println("Lutfen isminizi giriniz");
		 String isimIlkHarf=scan.nextLine();
		 System.out.println(isimIlkHarf.toUpperCase().charAt(0));
		 
		 scan.close();
	}
	}


