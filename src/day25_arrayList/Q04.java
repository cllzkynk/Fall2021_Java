/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CELÝL
 */
public class Q04 {

	
	public static void main(String[] args) {
		/*
		 * remove() methodu kullanarak, F’yi siliniz.
ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
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
		System.out.println(list);
	}

}
