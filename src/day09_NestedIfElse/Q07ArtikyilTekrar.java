package day09_NestedIfElse;

import java.util.Scanner;

public class Q07ArtikyilTekrar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir yil giriniz");
		
		int yil =scan.nextInt();
		if (yil%4!=0) {
			System.out.println("artik yil degildir");
		 } else if (yil%100!=0){
			 System.out.println("artik yildir");
		} else if (yil%400==0) {
			System.out.println("artik yildir1");
		} else {
			System.out.println("artik yil degildir1"); }
		
scan.close();
	}

}
