package day05_metamatikselIslemler;
import java.util.Scanner;

public class AyYilUyku {

	public static void main(String[] args) {
	
		
		 /*
		 
		 * SORU 5
		 * 
		 * Kullaniciya gunde kac saat uyudugunu sorun, 
		 * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
		 * 
		 * Ornek : Input : 8 
		 *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor.
		 */
		
Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen gunde kac saat uyudugunuzu yaziniz.");
		
		double uykuSaati=scan.nextDouble();
		
		System.out.println("Gunde  "+ uykuSaati+" saat uyuyorsaniz; \n"
				+ "\t\t\t ayda  "+uykuSaati*30/24 +",\n"
				+"\t\t\t yilda " +  uykuSaati*365/24 + " ,\n"
						
				+"\t\t\t 40 yilda " +  uykuSaati*365/24*40 + "\n"+
				"gununuz  uykuda geciyor"); 
				
				 
		
		
		System.out.println((9.5F*4.5F-2.5F*3F)/(45.5F-3.5F));	
		
		
		scan.close();
	}

}
