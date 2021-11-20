package day05_matematikselIslemler;

import java.util.Scanner;

public class C06_ModulusTekrar2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		System.out.println("girdiginiz sayi : " + sayi);

		int rakamlarToplami = 0;

		int rakam = sayi % 10; // sayinin birler basamagini elde ediyor
		System.out.println("sayinin birler basamagi : " + rakam);
		rakamlarToplami += rakam;

		sayi /= 10; // sayinin birler basamagindan kurtulduk
		System.out.println("sayimiz su anda uc basamakli oldu : " + sayi);
		// rakamlarToplami += rakam;

		
		rakam = sayi % 10;// yeni uc basamakli sayimizin birler basamagini elde ettik
		System.out.println("yeni uc basamakli sayimizin birler basamagi : " + rakam);

		rakamlarToplami += rakam;
		
		
		System.out.println("___________________"+rakamlarToplami);

		sayi /= 10;// yine sayimizin birler basamagindan kurtulduk ve sayimiz iki basamakli oldu
		System.out.println("sayimiz su anda iki basamakli oldu :" + sayi);
		System.out.println("sayimizin simdiki rakamlar toplami :" + rakamlarToplami);

		rakam = sayi % 10;// yeni iki basamakli sayimizin birler basamagini elde ettik
		System.out.println("yeni iki basamakli sayimizin birler basamagi : " + rakam);
		rakamlarToplami += rakam;
		
		System.out.println("___________________"+rakamlarToplami +" "+"2"); 
		
		sayi /= 10;
		System.out.println("sayimiz su anda tek basamakli : " + sayi);
		
		rakamlarToplami +=sayi;
		
		System.out.println("rakamlarToplami sonuc olarak "+rakamlarToplami );
		
		scan.close();
	}

}