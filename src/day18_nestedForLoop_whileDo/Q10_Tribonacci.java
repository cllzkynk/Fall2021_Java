package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q10_Tribonacci {

	public static void main(String[] args) {
		/*
		 * Tribonacci dizisi, genel olarak fibonacci dizisinin ��l� hali olarak
		 * d���n�lebilir. N. eleman� bulabilmek i�in (n-1)+(n-2)+(n-3) form�l�
		 * kullan�l�r.
		 * 
		 * 
		 * 0 � 1 � 1 � 2 � 4 � 7 � 13 � 24 � 44 � �..
		 * 
		 * Diye devam eden dizidir.
		 */
	//bu diziyi olusturan algoritmayi yaziniz
		
		 
        int birinci=0;
        int ikinci=1;
        int ucuncu=1;
        int dorduncu=birinci+ikinci+ucuncu;
        
        System.out.println("Ka� Adet Tribonacci Dizisi G�rmek �stiyorsunuz ?");
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


