/**
 * 
 */
package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CELÝL
 */
public class Q03 {
public static void main(String[] args) {
	/*
	 * 3) set() methodu kullanarak, E’yi D yapiniz.
ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
	 */

	List<String> list = new ArrayList<>();
	list.add("A");
	list.add("C");
	list.add("E");
	list.add("F");

	list.add("B");

	list.add(1, "L");

	
	list.set(3,"D");
	System.out.println(list);
}
}
