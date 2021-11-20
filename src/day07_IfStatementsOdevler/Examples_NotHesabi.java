package day07_IfStatementsOdevler;

import java.util.Scanner;

public class Examples_NotHesabi {

	public static void main(String[] args) {
		// Sadece if	ler kullanilarak uni not hesabi
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen vize notunuzu giriniz");
		int vize=scan.nextInt();
		
		System.out.println("Lutfen final notunuzu giriniz");
		int fnal=scan.nextInt();    //Final kelimesi javada reserve keyword dur 
									//onu biz variable ismi olarak kullanamayiz
		
		double ortalama= vize*0.3+fnal*0.7 ;
		
		if (ortalama<=29) {
			System.out.println("Harf notunuz FF ");
			}
		if (30<=ortalama && ortalama<=39) {
			System.out.println("Harf notunuz FD ");
			}
		if (40<=ortalama && ortalama<=49) {
			System.out.println("Harf notunuz DD ");
			}
		if (50<=ortalama && ortalama<=59) {
			System.out.println("Harf notunuz DC ");
			}
		if (60<=ortalama && ortalama<=69) {
			System.out.println("Harf notunuz CC ");
			}
		if (70<=ortalama && ortalama<=74) {
			System.out.println("Harf notunuz CB ");
			}
		if (75<=ortalama && ortalama<=84) {
			System.out.println("Harf notunuz BB ");
			}
		if (85<=ortalama && ortalama<=89) {
			System.out.println("Harf notunuz BA ");
			}
		if (90<=ortalama && ortalama<=100) {
			System.out.println("Harf notunuz AA ");
			}
		scan.close();
	}

}
