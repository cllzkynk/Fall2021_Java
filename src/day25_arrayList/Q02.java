/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CELÝL
 */
public class Q02 {

	public static void main(String[] args) {
		/*
		 * 2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz. index’li add()
		 * methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz. ArrayList’i ekrana
		 * yazdiriniz, list goyle olmali; A, L, C, E, F, B
		 */

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");

		list.add("B");

		list.add(1, "L");

		System.out.println(list);
	}

}
