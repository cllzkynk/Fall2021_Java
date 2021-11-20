package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q09_Fibonacci {

	public static void main(String[] args) {
		// fibonacci sayisi olustrunuz
		

		 
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayýsý Görmek Ýstiyorsunuz?");
        int sayi=klavye.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;
        
        System.out.println("Fibonacci Sayýlarý ");  
        System.out.print(birinci+ " "+ikinci+ " "); 
        
            while(sayi>0){
            System.out.print(ucuncu+ " "); 
            sayi--;        
            birinci=ikinci;
            ikinci=ucuncu;      
            ucuncu=birinci+ikinci; 
             
              
          }   
        klavye.close();
    }

}

