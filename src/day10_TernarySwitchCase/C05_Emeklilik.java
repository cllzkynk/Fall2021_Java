package day10_TernarySwitchCase;

import java.util.Scanner;

public class C05_Emeklilik {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen yasinizi giriniz : ");
	        int yas=scan.nextInt();
	        System.out.println("Lutfen cinsiyetinizi E ve K olarak giriniz ");
	        char cinsiyet=scan.next().toUpperCase().charAt(0);
	        
	       
	        
System.out.println(cinsiyet=='K'? (yas>=60 ? "Emekli olabilirsin ": "Emekli olamazsin"):(yas>=65 ? "Emekli olabilirsin" : "Emekli olamazsin"));
	
	/*
	 * hoca 
	 * 
	 * char cinsiyet ='E';
        int yas=71;
        
        String sonuc = cinsiyet=='K' ?  (yas>=60 ? "Emekli olabilirsin":"Emekli olamazsin") :
                                        (yas>=65 ? "Emekli olabilirsin":"Emekli olamazsin") ;
        
        System.out.println(sonuc);
	 */
	
	scan.close();
	}

}
