/**
 * 
 */
package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author CELÝL
 */
public class Q02_ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Soru 2: Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin
		 * toplamini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */

		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 2, 3, 4, 5,6));
		int toplam = 0;
		for (Integer i : list) {
			toplam += (i * i);
		}
		System.out.println(toplam);
	}

}
