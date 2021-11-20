package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q12_Kombinasyon {

	public static void main(String[] args) {
		// girilen sayinin kombinasyonunu hesaplayiniz
		

		 Scanner klavye=new Scanner(System.in);
	        System.out.println("N De�erini Giriniz");
	        int n=klavye.nextInt();
	        
	        System.out.println("R De�erini Giriniz");
	        int r=klavye.nextInt();
	        
	        if(n<r){
	            
	            System.out.println("N Say�s� R Say�s�ndan B�y�k Olmal�d�r. L�tfen Tekrar N De�erini Giriniz.");
	            n=klavye.nextInt();
	            KombinasyonHesapla(n,r);
	        }else{
	            KombinasyonHesapla(n,r);
	        }
	        klavye.close();
	    }

	public static void KombinasyonHesapla(int n, int r) {
	        
	        int faktoriyel_1=1;
	        int faktoriyel_2=1;
	        int faktoriyel_3=1;
	        int fark=n-r;
	        
	        for(int i=1;i<=n;i++){
	            
	            faktoriyel_1=faktoriyel_1*i;
	        }
	        System.out.println("N Say�s�n�n Fakt�riyeli : " + faktoriyel_1);
	        
	        for(int j=1;j<=r;j++){
	            
	            faktoriyel_2=faktoriyel_2*j;
	        }
	        System.out.println("R Say�s�n�n Fakt�riyeli : " + faktoriyel_2);
	        
	        for(int k=1;k<=fark;k++){
	            
	            faktoriyel_3=faktoriyel_3*k;
	        }
	        System.out.println("(N-R)'nin Fakt�riyeli : " + faktoriyel_3);
	        
	        int carpim=faktoriyel_2*faktoriyel_3;
	        int kombinasyon=faktoriyel_1/carpim;
	        
	        System.out.println(n + " Say�s�n�n " + r + "'li" + " Kombinasyonu = " + kombinasyon);
	    }

	}
