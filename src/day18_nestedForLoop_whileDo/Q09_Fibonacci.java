package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q09_Fibonacci {

	public static void main(String[] args) {
		// fibonacci sayisi olustrunuz
		

		 
        Scanner klavye=new Scanner(System.in);
        System.out.println("Ka� Adet Fibonnacci Say�s� G�rmek �stiyorsunuz?");
        int sayi=klavye.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;
        
        System.out.println("Fibonacci Say�lar� ");  
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

