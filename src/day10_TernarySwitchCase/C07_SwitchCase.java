package day10_TernarySwitchCase;

import java.util.Scanner;



public class C07_SwitchCase {

	public static void main(String[] args) {
		//gun numarasinia gore gun isimlerini yazdiralim
		
		Scanner giris=new Scanner (System.in);
		System.out.println("Lutfen gun sirasini giriniz");
		int gunNo=giris.nextInt();
		
		switch(gunNo) {
		case 1 :
			System.out.println("Pazartesi");
			break;
		case 2 :
			System.out.println("Sali");
			break;
		case 3 :
			System.out.println("Carsamba");
			break;
		case 4 :
			System.out.println("Persembe");
			break;
		case 5 :
			System.out.println("Cuma");
			break;
		case 6 :
			System.out.println("Pazartesi");
			break;
		case 7 :
			System.out.println("Cumartesi");
			break;
			default:
				System.out.println("Gecersiz gun numarasi girdiniz");
				}
giris.close();
	}

}
