package day08_IfElseStatements;

import java.util.Scanner;

public class DENEME1 {

	public static void main(String[] args) {
	    /*
         * SORU 1
         * 
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * 
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapin
         */
         
            Scanner scan =new Scanner (System.in);
              
               System.out.println("�r�n adedi giriniz");
               int Adet=scan.nextInt() ;
               
               System.out.println("�r�n fiyati giriniz");
               double Fiyat=scan.nextDouble();
               
               System.out.println("M�steri karti");
               boolean mKart=scan.nextBoolean();
               
               double iFiyat ;
               
                  if(mKart) {
                      if ( Adet>10) {
                              iFiyat=Fiyat*0.20;
                              Fiyat=Fiyat-iFiyat;
                              System.out.println(Fiyat +" dir");
                      } else {
                              iFiyat=Fiyat*0.15;
                              Fiyat=Fiyat-iFiyat;
                              System.out.println(Fiyat +" dir");
                      }
                      
                  }else {
                      if(Adet>10){
                              iFiyat=Fiyat*0.15;
                              Fiyat=Fiyat-iFiyat;
                              System.out.println(Fiyat +" dir");
                  }else {
                              iFiyat=Fiyat*0.10;
                              Fiyat=Fiyat-iFiyat;
                              System.out.println(Fiyat +" dir");
                        }
                          
                  }
              scan.close();  
          }
}
