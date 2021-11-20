package day08_IfElseStatements;

import java.util.Scanner;

public class Q03_Eskenarmi {

	public static void main(String[] args) {
		//  Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
		//birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana 
		//“Eskenar degil” yazdirin.
		
		Scanner input=new Scanner (System.in); // scan in illa scan diye isimlendirilmesi gerekmez 
		
		System.out.println("Lutfen birinci kenari giriniz");
		double k1=input.nextDouble();
		
		System.out.println("Lutfen ikinci kenari giriniz");
		double k2=input.nextDouble();
		
		System.out.println("Lutfen ucuncu kenari giriniz");
		double k3=input.nextDouble();
		
		if (k1==k2&&k2==k3) {
			System.out.println("Kenarlari girilen ucgen ESKENAR ucgendir");
		} else if ((k1==k2 && k3!=k1)|| (k1==k3 && k2!=k1)||(k3==k2 && k3!=k1)) {		
			System.out.println("Kenarlari girilen ucgen IKIZKENAR ucgendir");
		} else System.out.println("Kenarlari girilen ucgen CESITKENAR ucgendir");

		input.close();
	}

}
