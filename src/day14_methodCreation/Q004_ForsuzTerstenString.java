package day14_methodCreation;

import java.util.Scanner;

public class Q004_ForsuzTerstenString {
	public static void main(String[] args) {
		// klavyeden girilen bir degeri method kullanarak tersten yazdiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bisiler gir");
		String str = scan.nextLine();
		
		//String cevrilen=cevir(str);
		
		System.out.println("Cevrilen yazi : "+cevir(str));
		
		scan.close();
	}

	@SuppressWarnings("unused")
	public static  String cevir(String str) {
		
		if (str.isEmpty()) {
			
			//System.out.println(" ");
			//return str;
		} 
		String flag="        "+ str;
		//System.out.println(flag+"_"+str.charAt(0));
		System.out.println(cevir(str.substring(1))+str.charAt(0));
		return cevir(str.substring(1))+str.charAt(0); //123==>231 
		
		
	}
}
