package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q10_Tribonacci {

	public static void main(String[] args) {
		/*
		 * Tribonacci dizisi, genel olarak fibonacci dizisinin üçlü hali olarak
		 * düþünülebilir. N. elemaný bulabilmek için (n-1)+(n-2)+(n-3) formülü
		 * kullanýlýr.
		 * 
		 * 
		 * 0 – 1 – 1 – 2 – 4 – 7 – 13 – 24 – 44 – …..
		 * 
		 * Diye devam eden dizidir.
		 */
	//bu diziyi olusturan algoritmayi yaziniz
		
		 
        int birinci=0;
        int ikinci=1;
        int ucuncu=1;
        int dorduncu=birinci+ikinci+ucuncu;
        
        System.out.println("Kaç Adet Tribonacci Dizisi Görmek Ýstiyorsunuz ?");
        Scanner klavye=new Scanner(System.in);
        int sayi=klavye.nextInt();
        
        
        
        System.out.println("Tribonacci Dizisi :");
        System.out.print(birinci+" "+ikinci+" "+ucuncu+" ");
        
        while(sayi-3>0){
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=dorduncu;
            dorduncu=birinci+ikinci+ucuncu;
            System.out.print(dorduncu+" ");
        }
      klavye.close();  
    }
	}


