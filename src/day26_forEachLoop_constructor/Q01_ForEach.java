/**
 * 
 */
package day26_forEachLoop_constructor;

/**
 * @author CELÝL
 */
public class Q01_ForEach {

	public static void main(String[] args) {
		/*
		 * Soru 1:
Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		 */
		int [] arr= {1,2,3,4,5};
		int carpim=1;
		
		for (int i : arr) {
			carpim*=i;
		}
System.out.println(carpim);
	}

}
