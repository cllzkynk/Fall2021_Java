/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author CELÝL
 */
public class Q05 {

	public static void main(String[] args) {
		/*
		 * 5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
		 * ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
		 * 
		 */
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");

		list.add("B");

		list.add(1, "L");

		
		list.set(3,"D");
		list.remove(4);
		Collections.sort(list);
		System.out.println(list);
	}

}
