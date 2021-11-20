package day03_Scanner;

import java.util.Scanner;

public class C07_ScannerOdev1to4 {

	public static void main(String[] args) {
		/* Soru 1 
		 * Kullanicidan iki tamsayi alip bu sayilarin toplam fark ve carpimlarini yazdiriniz.
		 */
		Scanner scan=new Scanner (System.in); 
		 
		System.out.println("Lutfen iki tamsayi giriniz");
		int tam1=scan.nextInt();
		int tam2=scan.nextInt();
		System.out.println("Girilen sayilarin toplami  : " +(tam1+tam2));
		System.out.println("Girilen sayilarin farki    : " +(tam1-tam2));
		System.out.println("Girilen sayilarin carpimi  : " +(tam1*tam2));
		
		System.out.println("-------------------------------------------------------------------------");
		
		/*  Soru 2
		 * Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
		 */
		System.out.println("Lutfen karenizin kenarini giriniz");
		double kenar1=scan.nextDouble();
		System.out.println("Kenari girilen karenin cevresi : " + (kenar1*4));
		System.out.println("Kenari girilen karenin alani   : " + (kenar1*kenar1));
		
		System.out.println("-------------------------------------------------------------------------");
		
		/*  Soru 3 
		 * Kullanicidan yari cap isteyip dairenin  cevre ve alanini hesaplayip yazdirin
		 */
		System.out.println("Lutfen yaricapi giriniz");
		double yaricap=scan.nextDouble();
		System.out.println("Girilen yaricapli dairenin cevresi : " + (2*Math.PI*yaricap));
		System.out.println("Girilen yaricapli dairenin alani   : " + (Math.PI*yaricap*yaricap));
		
		System.out.println("-------------------------------------------------------------------------");
		
		/* Soru 4 
		 * Kullanicidan dikdortgenler prizmasinin uzun kisa kenarlarini yuksekligini isteyip
		 *  prizmanin hacmini hesaplayarak yazdiriniz
		 */
		
		System.out.println("Lutfen prizmanin uzun kenarini giriniz");
		double prizmaUzun=scan.nextDouble();
		System.out.println("Lutfen prizmanin kisa kenarini giriniz");
		double prizmaKisa=scan.nextDouble();
		System.out.println("Lutfen prizmanin yuksekligini giriniz");
		double prizmaYukseklik=scan.nextDouble();
		System.out.println("Lutfen prizmanin hacmi :" + (prizmaUzun*prizmaKisa*prizmaYukseklik));
		
		scan.close();
	}

}
