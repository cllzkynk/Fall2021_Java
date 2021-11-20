package day08_IfElseStatements;

import java.util.Scanner;

public class Q08_SesliHarfMi {

	public static void main(String[] args) {
		// Kullanicidan bir harf alin eger harf a, e, i, o, u  dan biri ise ekrana Sesli harf yazdirin.
		// c, d, f  den biri ise ekrana  Sessiz harf  yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a, e, i, o, u, b, c, d, f harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
		
		if(harf=='a' || harf=='e' || harf=='i' || harf=='o' || harf=='u' ) {
			System.out.println(harf + " sesli harftir.");
		}else if(harf=='b' || harf=='c' || harf=='d' || harf=='f') {
			System.out.println(harf + " sessiz harftir.");
		}else {
			System.out.println("Yanlis harf girdiniz.");
		}
		
		scan.close();
	}
}

