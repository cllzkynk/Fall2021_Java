package day05_metamatikselIslemler;

import java.util.Scanner;

public class C08_ModulesExamples {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		
		// 1234
		
		int sonRakam=sayi%10;            //4
		int sondanIki=(sayi/10)%10 ;     //3
		int sondanUc=(sayi/100)%10 ;     //2
		int ilkRakam=(sayi/1000)%10 ;    //1
		
		System.out.println("Ilk rakam  : "+ilkRakam +"\nikinci rakam : "+
		sondanUc +"\nucuncu  rakam : " + sondanIki +"\nSon rakam  :  "+ sonRakam );
		
		System.out.println("Girilen sayinin rakamlar toplami : "+ (sonRakam+sondanIki+sondanUc+ilkRakam) );
		
		System.out.println(sonRakam+""+sondanIki+""+sondanUc+""+ilkRakam);
		
		System.out.println(sondanIki+""+sonRakam+""+""+ilkRakam +""+sondanUc);
		
		
		
	
	        System.out.println("Bir sayi Girin");
	        //Mudurum turkce karakter kullanma 
	        //IT dili ingilizce o sebeple klavyeni ingilizceye cevir, 
	        //hem alistikca emin ol daha hizli kod yazarsin.
	        @SuppressWarnings("unused")
			int sayii = scan.nextInt();
	        System.out.println("Rakamlari Toplami..:");
	        int rakamlarToplami = 0;
	        
	        while (sayi > 0) {
	            int rakam = sayi % 10;
	            rakamlarToplami += rakam;
	            sayi /= 10;
	        }
	        System.out.println(rakamlarToplami);
	        
	        scan.close();
	    }
		
	
		
	}


