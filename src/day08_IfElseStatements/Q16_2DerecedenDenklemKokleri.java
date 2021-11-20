package day08_IfElseStatements;

import java.util.Scanner;

public class Q16_2DerecedenDenklemKokleri {
	/*
	 * Ikinci Dereceden Bir Denklemin Koklerinin Bulunması Lise yillarinda
	 * ogrendigimiz ikinci derece denklem,
	 * ax2 + bx + c = 0
	 * seklinde ifade edilir. Denklemin Kokleri hakkinda bilgi sahibi olabilmek
	 * icin, denklemin diskriminantı adi verilen,
	 * ∆=b2–­4ac
	 * ifadesini hesaplamamiz gerekir. Diskriminantın degerlerine gore, eger ∆<0 ise
	 * denklemin gerçel sayilarla ifade edilebilecek bir Koku yoktur.
	 * ∆=0 ise denklemin, degerleri birbirine esit olan iki Koku vardir ve bunlar,
	 * x1=x2= –b/ (2a)
	 * seklinde hesaplanirlar. Bunlara iki kat kok ya da cakişik Kok adi verilir.
	 * ∆>0 ise de denklemin birbirinden farkli iki gerçel koku vardir ve bunlar, * 
	 * x1=(–b+√∆)/(2a)
	 * ve  
	 * x2=(–b–√∆)/(2a) * 
	 * seklinde hesaplanirlar.
	 */
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("ax^2+bx+c seklindeki denklemin istenen degerlerinin asagiya giriniz");
		System.out.println("a: ");
		a = giris.nextDouble();

		System.out.println("b: ");
		b = giris.nextDouble();

		System.out.println("c: ");
		c = giris.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Gercek kok yoktur. \n");
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("x1=x2=" + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}

		giris.close();
	}
}
