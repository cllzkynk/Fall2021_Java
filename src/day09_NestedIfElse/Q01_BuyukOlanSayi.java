package day09_NestedIfElse;

import java.util.Scanner;

public class Q01_BuyukOlanSayi {

	public static void main(String[] args) {
		//Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen sairayla iki sayi giriniz \nx:");
		double x=scan.nextDouble();
		System.out.println("y:");
		double y=scan.nextDouble();
		
		System.out.println(x<y? "ilk sayi kucuk sayidir " :(x==y ? "sayilar esit":" ikinci sayi kucuktur"));
		
		scan.close();
	}

}
