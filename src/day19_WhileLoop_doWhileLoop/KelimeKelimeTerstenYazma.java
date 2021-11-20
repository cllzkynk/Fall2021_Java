package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;
/*
 * @Author CELIL
 */
public class KelimeKelimeTerstenYazma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bisiler gir ");
		String str = scan.nextLine();
		
		String TersStr = "";
		
		//ali-ata-bak //11
		
		if (str.contains(" ")) { 
			int ilk = str.indexOf(' ');
			for (int i = str.length() - 1; i > 0; i--) {
		if (str.charAt(i) == ' ') {
					TersStr = TersStr  + str.substring(i + 1)+" ";
					str = str.substring(0, i);
				} else {
					str = str;
				}
			}
			System.out.println("=====================");
			System.out.println(TersStr + " " + str.substring(0, ilk));
		} else { 
			TersStr = str;
			System.out.println("=====================");
			System.out.println(TersStr);
		}
		scan.close();
	}
}
