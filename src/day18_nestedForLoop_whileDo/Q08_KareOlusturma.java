package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q08_KareOlusturma {

	public static void main(String[] args) {
		/*
		 * Sorumuz �u: Klavyeden bir de�er girece�iz. �rne�in klavyeden 4 de�erini
		 * girdik. Bize 16 tane kare sunacak. 3 girersek 9 kare olu�acak. Bunu sa�layan
		 * algoritmay� kurunuz
		 */
	
		Scanner klavye=new Scanner(System.in);
        System.out.println("Bir Say� Giriniz");
        int k=klavye.nextInt();
        
        k=k*3;
        
        for(int i=3;i<=k;i++){//satir
            for(int j=0;j<=k;j++){//sutun
                
                if(i %3 ==0 && j<=k){ 
                    System.out.print( " * ");
                }else if(j%3==0 && i<=k){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
   klavye.close(); }       
    }