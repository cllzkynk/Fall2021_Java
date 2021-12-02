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
public class Q06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
		 * var olmadigini dogrulayiniz.
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
		System.out.println(list.contains("L"));
	}

}
