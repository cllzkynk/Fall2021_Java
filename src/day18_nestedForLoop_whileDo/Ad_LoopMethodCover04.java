package day18_nestedForLoop_whileDo;

import java.util.Scanner;

/**
 * @author CELÝL
 */
public class Ad_LoopMethodCover04 {

	public static int fib(int n) {
		
		if (n == 1)
			return 1;
		if (n == 0)
			return 1;
		return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Kacinci terimi istiyon ");
		int fibbo = scan.nextInt();

		fib(fibbo);
		System.out.println(fib(fibbo ) );
		
		scan.close();
	}

}