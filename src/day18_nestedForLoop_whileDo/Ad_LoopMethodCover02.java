package day18_nestedForLoop_whileDo;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class Ad_LoopMethodCover02 {
	// Loop kullanmadan sadece metodla faktoruyel hesaplayiniz

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hangi sayinin faktoriyelini istiyon");
		int sayi = scan.nextInt();
		// faktoriyel(sayi);
		System.out.println(faktoriyel(sayi));
		scan.close();
		
		
	}

	public static int faktoriyel(int sayi) {
		if (sayi == 1) {
			return 1;
		}
		return sayi * faktoriyel(sayi - 1);
	}

}
