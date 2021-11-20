package day18_nestedForLoop_whileDo;

import java.util.Scanner;

public class Q06_Piramid {

	public static void main(String[] args) {
		// yarim baklava yani ucgen olusturunuz
		Scanner klavye=new Scanner( System.in);
        System.out.println("Bir Sayý Giriniz :");
        int n=klavye.nextInt();
        
        
        
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=(n-i);j++){
                
                System.out.print(" ");
            }
            
            for(int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
      klavye.close();  
    }

}