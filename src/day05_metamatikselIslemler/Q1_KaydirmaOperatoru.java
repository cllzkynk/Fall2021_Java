package day05_metamatikselIslemler;

public class Q1_KaydirmaOperatoru {

	public static void main(String[] args) {

		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;

		c = a & b; /* 12 = 0000 1100 */ // bitler uzerinde  ve islemi 
		System.out.println("a & b = " + c);

		c = a | b; /* 61 = 0011 1101 */  //bitler uzerinde  veya islemi 
		System.out.println("a | b = " + c);

		c = a ^ b; /* 49 = 0011 0001 */  //bitler uzerinde  yada islemi 
		System.out.println("a ^ b = " + c);

		c = ~a; /*-61 = 1100 0011 */  //bitsel tersi 
		System.out.println("~a = " + c);

		c = a << 2; /* 240 = 1111 0000 */   // ayi 2 defa iye katla  oklar onemsiz yanindaki sayyi kac defa ikiye katla
		System.out.println("a << 2 = " + c);

		c = a >> 2; /* 15 = 1111 */ //// ayi 2 defa iye bol  oklar onemsiz yanindaki sayyi kac defa ikiye bol
		System.out.println("a >> 2  = " + c);

		c = a >>> 2; /* 15 = 0000 1111 */ // burada da 2 defa ikiye bol 
		System.out.println("a >>> 2 = " + c);

	}

}
