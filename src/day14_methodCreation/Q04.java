package day14_methodCreation;

public class Q04 {

	public static void main(String[] args) {
		// De�i�ken Tan�mlamas�:
		int a = 15, b = 30, c, d;
		c = topla(a, b);
		d = topla(a, b, c, c);
		System.out.println("1. Metot ��lem Sonucu: " + topla(a, b) + "\n2. Metot ��lem Sonucu: " + topla(a, b, c)
				+ "\n3. Metot ��lem Sonucu: " + topla(a, b, c, d));
	}

	// Metot Tan�mlamas�:
	public static int topla(int a, int b) {
		return a + b;
	}

	public static int topla(int a, int b, int c) {
		return a + b + c;
	}

	public static int topla(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}