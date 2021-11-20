package day17_forLoops;

public class Q15_AsalSayiBul {
	/*
	 * Prime Numbers Java Example This Prime Numbers Java example shows how to
	 * generate prime numbers between 1 and given number using for loop. 100 e kadar
	 */

	// yuze kadar attirma 1. for
	// 1 forun degerine kadar sayilarin bolunebilirligine bakacak 2. for lazim
	// ic ice .
	public static void main(String[] args) {

		
		
		for (int i = 2; i < 200; i++) {

			boolean karar = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					karar = false;

				}

			}

			if (karar) {
				System.out.print(i + " ");
			}

		}

	}// clas sonu

}
