package day01_02_Variables;

public class Day01_InterviewQuestions {

	public static void main(String[] args) {
		/*
		Interview Question
	    1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
		program yaziniz
		Orn : sayi1=10 ve sayi2=20;
		kod calistiktan sonra
		sayi1=20 ve sayi2=10  */
		
		int sayi1=10 ;  int sayi2=20;  int emanetciSayi ;
		System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2 = " + sayi2); 
	
		emanetciSayi=sayi1 ;
				sayi1=sayi2;
		       		sayi2=emanetciSayi ;
		System.out.println( "swap sonrasi sayi1=" + sayi1 + " ve sayi2 = " + sayi2);
	
		
		
		System.out.println("----------------------------------------------------------------");
				/* 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
degistiren (SWAP) bir program yapiniz */
				
		int x=5 ; int y= 6;
		System.out.println("Swap oncesi \nX : " +x+"\nY : "+y);
		
		x=x+y ; //Yeni durumda x=11 artik 
		y=x-y; // y=11-6=5 ; artik yeni y=5
		x=x-y ; // x 11 olmustu . 11 den y yani son y 65 idi 11-5=6
		System.out.println("Yeni durumda \nX : "+x+ "\nY : " + y);
	}

}
