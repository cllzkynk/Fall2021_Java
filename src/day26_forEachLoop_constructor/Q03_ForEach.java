/**
 * 
 */
package day26_forEachLoop_constructor;

/**
 * @author CELÝL
 */
public class Q03_ForEach {

	public static void main(String[] args) {
		/*
		 * Soru 3: iki String array olusturunuz ve bu array’lerdeki ortak elemanlari
		 * For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman
		 * yoksa ekrana “Ortak eleman yok” yazdiriniz
		 * 
		 */
		String [] arr1= {"A","B","C","D","E","F"};
		String [] arr2= {"A","K","C","L","E","M","Z"};
		
		for (String string : arr1) {
			for (String string2 : arr2) {
				if(string.equals(string2)) {
					System.out.print(string+" ");
				}
			}
		}

	}

}
