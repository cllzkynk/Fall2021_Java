package day14_methodCreation;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
	 
		// Klavyeden okuma yapmak i�in Scanner nesnesini olu�tur.
		Scanner reader = new Scanner(System.in ,"ISO-8859-9");
		System.out.print("Bir Say� Girin: ");

		String yazi = reader.nextLine();
		String cevrilen = cevir(yazi);
		System.out.println("�evrilen Yaz�: " + cevrilen);
		System.out.println();
		//System.out.println(yazi.charAt(0));
		//System.out.println(yazi.substring(1));
		//System.out.println(cevir(yazi.substring(1)) + yazi.charAt(0));
		//"ISO-8859-9"
		
		//  System.out.println("frontBack metodu ile"); String
		//  cevrilen2=KendimDenemeCevir(yazi); System.out.println(cevrilen2);
		  // basarisiz bi deneme 4 harflide sonu ikinciyi ucuncuyu e birinciyi aliyor
			// sirasiyle 4 3 2 1 degil 4 2 3 1 gidiyor
		reader.close();
	}

	public static String cevir(String yazi) {
		if (yazi.isEmpty())
		return yazi;
		//System.out.println(yazi); 
		//String flag="i";
		//System.out.println(flag);

		return cevir(yazi.substring(1)) + yazi.charAt(0);
		
		
		
	}


	public static String KendimDenemeCevir(String str) {
		if (str.length() <= 1)
			return str;

		String orta = str.substring(1, str.length() - 1);

		// son + orta + bas
		return str.charAt(str.length() - 1) + orta + str.charAt(0);
	} // yemedi tekrar dene bu olmamis olarak burada kalsin

}