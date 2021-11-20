package day17_forLoops;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersten yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime gir ");
		String str = scan.nextLine();
		String ters="";
		
		for (int i = str.length()-1; i >=0; i--) {
			ters=ters+str.charAt(i);
		}
		
		System.out.println(ters);
		
		
		
		
		
		
		
		
		
		
scan.close();
	}

}
